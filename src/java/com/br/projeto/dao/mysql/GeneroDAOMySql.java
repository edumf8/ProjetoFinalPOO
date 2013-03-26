/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao.mysql;

import com.br.projeto.bean.Genero;
import com.br.projeto.dao.GeneroDAO;
import com.br.projeto.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author victor
 */
public class GeneroDAOMySql implements GeneroDAO {

    private Connection connection;

    public GeneroDAOMySql() {
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public Genero getGenero(int idGenero) {
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from genero where id = ?");
            stmt.setInt(1, idGenero);
            ResultSet rs = stmt.executeQuery();
            if (rs.first()) {
                Genero genero = new Genero();
                genero.setId(rs.getInt("id"));
                genero.setNome(rs.getString("nome"));
                genero.setTipo(rs.getInt("tipo"));
                return genero;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
}
