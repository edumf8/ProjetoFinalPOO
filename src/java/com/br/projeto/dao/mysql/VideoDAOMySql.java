/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao.mysql;

import com.br.projeto.bean.Genero;
import com.br.projeto.bean.Video;
import com.br.projeto.dao.VideoDAO;
import com.br.projeto.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tamashiro
 * "select * from video Where id_genero = " + genero.getId()
 */
public class VideoDAOMySql implements VideoDAO{
    private Connection connection;
    
    public VideoDAOMySql(){
        this.connection= ConnectionFactory.getConnection();
    }
    
//    @Override
//    public void buscarVideosPorGenero(Genero genero) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    public void adiciona (Video video){
//        String sql = "insert into video" + "(titulo, genero)"+ "values(oi, saudar)";
        
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1,video.getTitulo());
//            stmt.setGenero(2,video.getGenero());
//           
//            stmt.execute();
//            stmt.close();
//            
//            }
//        catch (SQLException e) {
//            throw new RuntimeException(e);
//            }

    public ArrayList<Video> buscarVideosPorGenero(Genero genero){
        String sql = "select * from video where id_genero ="+ genero.getId();
        try{
            
        
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Video> videos = new ArrayList<Video>();
        
        while (rs.next()){
            Video video = new Video();
            video.setDescricao(rs.getString("descricao"));
            video.setQtdVisualizacoes(rs.getInt("qtd_visualizacoes"));
            
            videos.add(video);
            }
        return videos;
        }
        
        
        catch(SQLException ex){}
        return null;
    }

}

            
