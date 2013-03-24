/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Programa;
import java.util.Date;



/**
 *
 * @author Neusa
 */
public interface EpisodioDAO {
    public void inserirEpisodio(Programa programa, Date dataExibicao);
       
}
