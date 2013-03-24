/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Neusa
 */
public class Video {
    private int id;
    private String titulo;
    private Genero genero;
    private int classificacao;
    private Date dataCadastro;
    private int qtdVisualizacoes;
    private String urlVideo;
    private String urlImagem;
    private String descricao;
    
    private List<Avaliacao> avaliacoes;
    //private String tipo; Não se sabe se irá ser usada 
}
