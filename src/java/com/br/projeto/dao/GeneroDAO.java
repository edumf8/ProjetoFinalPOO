/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Genero;

/**
 * Interface de acesso a fonte de dados da classe Genero
 * @author Neusa
 */
public interface GeneroDAO {
    
    public Genero getGenero(int idGenero);
}