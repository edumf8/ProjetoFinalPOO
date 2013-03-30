/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.bean.Genero;
import com.br.projeto.bean.Video;
import java.util.ArrayList;

/**
 * Interface de acesso a fonte de dados da classe Video
 * @author Neusa
 */
public interface VideoDAO {
    
    
    public ArrayList<Video> buscarVideosPorGenero(Genero genero);
    /**
     * Método para buscar os vídeos com o texto da Barra de pesquisa
     * @param texto
     * @return 
     */
    public ArrayList<Video> buscarVideosPorTexto(String texto);
    public ArrayList<Video> buscarUltimosVideos(int quantidade);
    public Video get(int id);
}
