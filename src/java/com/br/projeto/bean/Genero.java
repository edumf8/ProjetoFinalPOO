/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.bean;

/**
 * A classe Genero representa os tipos de filmes e epsódios.
 * Para filmes há gêneros como: ação, comédia, terro, romance.
 * Para tv há gêneros como: novela, esportes, seriados, auditório
 * @author Neusa
 */
public class Genero {
    
    public static final int TV=1;
    public static final int FILME =2;
    
    private int id;
    private String nome;
    private int tipo;

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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
