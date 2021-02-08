/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TBS;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */

public class ConexaoCliente extends ConexaoBD{
    
    
    public void cadastrar(String nome, String cpf, int idade, String sexo, String email, String telefone){
        
        String sql = "insert into cliente values (?,?,?,?,?,?)";
        conectar();
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setString(2, cpf);
            estado.setInt(3, idade);
            estado.setString(4, sexo);
            estado.setString(5, email);
            estado.setString(6, telefone);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            fecharConexao();
        }
        
    }
    
    public void atualizar(String nome, int idade, String cpf, String sexo, String email, String telefone){
        
        String sql = "update cliente set nome = ?,idade = ?,sexo = ?,email = ?,telefone = ? where cpf = ?";
        conectar();
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setString(3, cpf);
            estado.setInt(2, idade);
            estado.setString(4, sexo);
            estado.setString(5, email);
            estado.setString(6, telefone);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }finally{
            fecharConexao();
        }
    }
    
    public void remover(String cpf){
        String sql = "delete from cliente where cpf = ?";
        conectar();
        try {
            estado = con.prepareStatement(sql);
            estado.setString(1, cpf);
            estado.execute();
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover");
        }finally{
            fecharConexao();
        }
        
    }
    
}
