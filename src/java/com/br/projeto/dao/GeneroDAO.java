/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Genero;
import java.util.List;

/**
 *
 * @author Neusa
 */
public interface GeneroDAO {
    public void inserirGenero(String nome, int tipo);
    
    public List<Genero> buscarGenerosPorTipo(int tipo);
}