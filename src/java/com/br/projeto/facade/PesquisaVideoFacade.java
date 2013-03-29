/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.facade;

import com.br.projeto.bean.Video;
import com.br.projeto.dao.VideoDAO;
import com.br.projeto.dao.mysql.VideoDAOMySql;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Neusa
 */
@ManagedBean
@RequestScoped
public class PesquisaVideoFacade {
    
    private VideoDAO videoDAO;
    private String textoPesquisa;

    public PesquisaVideoFacade() {
        videoDAO = new VideoDAOMySql();
    }

    public String getTextoPesquisa() {
        return textoPesquisa;
    }

    public void setTextoPesquisa(String textoPesquisa) {
        this.textoPesquisa = textoPesquisa;
    }
    
    public List<Video> getResultado() {
        System.out.println(textoPesquisa);
        List<Video> videos = new ArrayList<Video>();
        return videos;
    }
}
