/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */

public class ConexaoBD {
    
    String driver = "com.mysql.jdbc.Driver";
    String banco = "loja_virtual";
    String host = "localhost";
    String str_con = "jdbc:mysql://"+host+":3306/"+banco;
    String usuario = "root";
    String senha = "";
    
    
    Connection con;
    PreparedStatement estado;
    
    public void conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(str_con, usuario, senha); 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
        }   
    }
    
    public void fecharConexao(){
        try {
            estado.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
        }
        
    }
 
}