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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getQtdVisualizacoes() {
        return qtdVisualizacoes;
    }

    public void setQtdVisualizacoes(int qtdVisualizacoes) {
        this.qtdVisualizacoes = qtdVisualizacoes;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    
}

