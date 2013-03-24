/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Genero;

/**
 *
 * @author Neusa
 */
public interface VideoDAO {
    
    
    public void buscarVideosPorGenero(Genero genero);
}
