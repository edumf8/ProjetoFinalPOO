package com.br.projeto.facade;

import com.br.projeto.dao.VideoDAO;
import com.br.projeto.dao.mysql.VideoDAOMySql;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author victor
 */
@ManagedBean
@ApplicationScoped
public class VideoFacade {
    
    private int acessos;
    private VideoDAO videoDAO;

    public VideoFacade() {
        this.acessos = 0;
        videoDAO = new VideoDAOMySql();
    }

    public int getAcessos() {
        return ++acessos;
    }
}
