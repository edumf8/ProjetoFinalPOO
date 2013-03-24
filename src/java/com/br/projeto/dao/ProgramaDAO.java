/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Episodio;
import java.util.List;

/**
 *
 * @author Neusa
 */
public interface ProgramaDAO {
    
    public void inserirPrograma(String nome, List<Episodio> episodios);
}
