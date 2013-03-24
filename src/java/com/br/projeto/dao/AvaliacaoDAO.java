/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Usuario;
import com.br.projeto.bean.Video;


/**
 *
 * @author Neusa
 */
public interface AvaliacaoDAO {
   
    public int inserirAvaliacao(Usuario usuario, Video video, int pontuacao);
}
