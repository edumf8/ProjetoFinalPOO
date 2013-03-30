package com.br.projeto.bean;

import java.util.Date;

/**
 *
 * A classe Episodio é um tipo especal de vídeo que representa um vídeo de TV.
 * Vídeos dessa classe seriam novelas, seriados, esportes, ...
 * Todo Episodio está atrelado a um Programa e possui um número de ordem em que
 * foi exibido no determinado programa.
 */
public class Episodio extends Video {

    private Programa programa;
    private int numero;
    private Date dataExibicao;

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataExibicao() {
        return dataExibicao;
    }

    public void setDataExibicao(Date dataExibicao) {
        this.dataExibicao = dataExibicao;
    }

    /**
     * Polimorfismo do método getDescricao. Por estar atrelado a um Programa
     * é interessante mostrar na desrição de um episódio a qual ele pertence
     * e seu respectivo número.
     * @return 
     */
    @Override
    public String getDescricao() {
        return programa.getNome() + " - Episódio " + numero + " | " + super.getDescricao();
    }
}
