/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.pi.dao;

import br.senac.sp.pi.model.Produto;
import br.senac.sp.pi.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Gabri
 */
public class ProdutoDAO
{
    public static void inserirProduto(Produto p)
    {
        String sql = "INSERT INTO produtos (nome, descricao, quantidade,preco) VALUES (?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try 
        {
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
                
            pst.setString(1, p.getNome());
            pst.setString(2, p.getDescricao());
            pst.setInt(3, p.getQtd());
            pst.setDouble(4, p.getPreco());
            
            pst.execute();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
     public static void AlterarProduto(Produto p)
    {
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, quantidade = ?, preco = ? WHERE idProduto = ?";
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try 
        {
            conn = ConnectionUtils.getConnection();
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, p.getNome());
            pst.setString(2, p.getDescricao());
            pst.setInt(3, p.getQtd());
            pst.setDouble(4, p.getPreco());
            pst.setInt(5, p.getIdProduto());
            
            pst.execute();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
}
