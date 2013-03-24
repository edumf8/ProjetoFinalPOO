/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao.mysql;

import com.br.projeto.bean.Genero;
import com.br.projeto.dao.VideoDAO;
import java.sql.Connection;

/**
 *
 * @author Tamashiro
 * "select * from video Where id_genero = " + genero.getId()
 */
public class VideoDAOMySql implements VideoDAO{
    private Connection connection;

    @Override
    public void buscarVideosPorGenero(Genero genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
