/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import com.br.projeto.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author c31433
 */
public class FilmeDAO {

    
    public void insert() {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query = "Insert into tb_filmes (vc_NomeFilmes) values(?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, "FILME Teste");

            stmt.execute();
            con.close();
            stmt.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public List<Filme> select() {
//        List<Filme> listaFilme = new ArrayList<Filme>();
//        try {
//            
//            Connection con = ConnectionFactory.getConnection();
//            String query = "Select * from tb_filmes ";
//            PreparedStatement stmt = con.prepareStatement(query);
//            ResultSet rs = stmt.executeQuery();
//            
//            while (rs.next()) {
//                Filme filme = new Filme();
//                filme.setNomeFilme(rs.getString("vc_NomeFilmes"));
//                filme.setCategoriaFilme(rs.getString("vc_CategoriaFilme"));
//                listaFilme.add(filme);
//            }
//            con.close();
//            stmt.close();
//            rs.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        
//        return listaFilme;
//    }
}
