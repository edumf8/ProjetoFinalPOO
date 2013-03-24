/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.projeto.dao;

import java.util.Date;

/**
 *
 * @author Neusa
 */
public interface UsuarioDAO {
    
    public void inserirUsuario(String nome, String email, String senha, Date dataCadastro);
    
}
