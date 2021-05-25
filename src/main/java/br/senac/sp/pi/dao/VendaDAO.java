package br.senac.sp.pi.dao;

import br.senac.sp.pi.model.ItemVenda;
import br.senac.sp.pi.model.Venda;
import br.senac.sp.pi.utils.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Fabricio
 */
public class VendaDAO {

    public static boolean salvar(Venda v, ArrayList<ItemVenda> iv) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        PreparedStatement instrucaoSQL2 = null;
        PreparedStatement instrucaoSQL3 = null;
        PreparedStatement instrucaoSQL4 = null;
        ResultSet rsQtd = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO venda (data_venda, id_cliente, valor_total) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setDate(1, new java.sql.Date(v.getDataVenda().getTime()));
            instrucaoSQL.setInt(2, v.getIdCliente());
            instrucaoSQL.setDouble(3, v.getValorTotal());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet rs = instrucaoSQL.getGeneratedKeys();
                int id = 0;
                if(rs.next()){
                    id = rs.getInt(1);
                    for (ItemVenda item : iv) {
                        instrucaoSQL2 = conexao.prepareStatement("INSERT INTO item_venda (id_venda, id_produto, qtd, valor_unitario) VALUES (?,?,?,?)");
                        instrucaoSQL2.setInt(1, id);
                        instrucaoSQL2.setInt(2, item.getIdProduto());
                        instrucaoSQL2.setInt(3, item.getQtdVenda());
                        instrucaoSQL2.setDouble(4, item.getValorUnitVenda());
                        instrucaoSQL2.executeUpdate();
      
                        instrucaoSQL3 = conexao.prepareStatement("SELECT qtd FROM produto WHERE id = ?");
                        instrucaoSQL3.setInt(1, item.getIdProduto());
                        rsQtd = instrucaoSQL3.executeQuery();
                        
                        int qtdNova = (item.getQtdVenda() - rs.getInt("qtd"));
      
                        instrucaoSQL4 = conexao.prepareStatement("UPDATE produto SET qtd = ? WHERE id = ?");
                        instrucaoSQL4.setInt(1, qtdNova);
                        instrucaoSQL4.setInt(2, item.getIdProduto());
                    }
                } else {
                    throw new SQLException("Erro ao obter o ID da venda!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro na gravação!");
        } finally {
            try {
                if (instrucaoSQL != null) {
                    ConexaoBD.fecharConexao();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão do BD!");
            }
        }
        
        return retorno;
    }
}
