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
 */
public class VideoDAOMySql implements VideoDAO {

    private Connection connection;

    public VideoDAOMySql() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public ArrayList<Video> buscarVideosPorGenero(Genero genero) {
        String sql = "select * from video where id_genero = " + genero.getId();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Video> videos = new ArrayList<Video>();
            while (rs.next()) {
                Video video = new Video();
                video.setDescricao(rs.getString("descricao"));
                video.setQtdVisualizacoes(rs.getInt("qtd_visualizacoes"));
                video.setClassificacao(rs.getInt("classificacao"));
                video.setDataCadastro(rs.getDate("data_cadastro"));
                video.setGenero(genero);
                video.setId(rs.getInt("id"));
                video.setTitulo(rs.getString("titulo"));
                video.setUrlImagem(rs.getString("url_imagem"));
                video.setUrlVideo(rs.getString("url_video"));
                videos.add(video);
            }
            return videos;
        } catch (SQLException ex) {
        }
        return null;
    }
}
