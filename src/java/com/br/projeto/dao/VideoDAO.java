/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Genero;
import com.br.projeto.bean.Video;
import java.util.ArrayList;

/**
 *
 * @author Neusa
 */
public interface VideoDAO {
    
    
    public ArrayList<Video> buscarVideosPorGenero(Genero genero);
    public ArrayList<Video> buscarVideosPorTexto(String texto);
    public ArrayList<Video> buscarUltimosVideos(int quantidade);
    public Video get(int id);
}
