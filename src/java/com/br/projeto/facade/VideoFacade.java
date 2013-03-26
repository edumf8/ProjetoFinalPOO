package com.br.projeto.facade;

import com.br.projeto.bean.Genero;
import com.br.projeto.bean.Video;
import com.br.projeto.dao.GeneroDAO;
import com.br.projeto.dao.VideoDAO;
import com.br.projeto.dao.mysql.GeneroDAOMySql;
import com.br.projeto.dao.mysql.VideoDAOMySql;
import java.util.ArrayList;
import java.util.List;
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
    private GeneroDAO generoDAO;

    public VideoFacade() {
        this.acessos = 0;
        videoDAO = new VideoDAOMySql();
        generoDAO = new GeneroDAOMySql();
    }

    public List<Video> listarVideosPorGenero(int idGenero) {
        Genero genero = generoDAO.getGenero(idGenero);
        if (genero == null) {
            return new ArrayList<Video>();
        }
        return videoDAO.buscarVideosPorGenero(genero);
    }
}
