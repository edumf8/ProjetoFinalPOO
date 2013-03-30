/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.bean;

import java.util.List;

/**
 * A classe Programa representa um agrupamento de episódios.
 * Pode representar desde um seriado até um campeonato de futebol (claro que
 * nesse caso não são episódios mesmo, mas por abstração se encaixa adequadamente)
 * @author Neusa
 */
public class Programa {

    private int id;
    private String nome;
    private List<Episodio> episodios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
}
