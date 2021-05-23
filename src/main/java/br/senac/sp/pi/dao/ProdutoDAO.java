package br.senac.sp.pi.dao;

import br.senac.sp.pi.model.Produto;
import br.senac.sp.pi.utils.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Fabricio Belomo
 */
public class ProdutoDAO {

    public static boolean salvar(Produto p) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto(nome, descricao, qtd, preco) VALUES (?,?,?,?)");
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getDescricao());
            instrucaoSQL.setInt(3, p.getQtd());
            instrucaoSQL.setDouble(4, p.getPreco());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Erro ao obter o ID do produto!");
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

    public static boolean alteracaoSalvar(Produto p) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET nome = ?, descricao = ?, qtd = ?, preco = ? " +
                                                    "WHERE id = ?");
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getDescricao());
            instrucaoSQL.setInt(3, p.getQtd());
            instrucaoSQL.setDouble(4, p.getPreco());
            instrucaoSQL.setInt(5, p.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Erro ao obter o ID da venda!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro na alteração!");
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

    public static boolean exclusao(int idProduto) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id = ?");
            instrucaoSQL.setInt(1, idProduto);

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na exclusão!");
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

    public static ArrayList<Produto> pesquisaPorNomeOuId(String nome, int id) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id = ? OR nome like ?");
            instrucaoSQL.setInt(1, id);

            if (nome.equals("") && id == 0) {
                instrucaoSQL.setString(2, "%" + nome + "%");
            } else if (nome.equals("")) {
                instrucaoSQL.setString(2, nome);
            } else {
                instrucaoSQL.setString(2, "%" + nome + "%");
            }
            rs = instrucaoSQL.executeQuery();

            while(rs.next()) {
                Produto objLinha = new Produto();
                objLinha.setId(rs.getInt("id"));
                objLinha.setNome(rs.getString("nome"));
                objLinha.setDescricao(rs.getString("descricao"));
                objLinha.setQtd(rs.getInt("qtd"));
                objLinha.setPreco(rs.getDouble("preco"));
                listaRetorno.add(objLinha);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaRetorno = null;
        } finally {
            try {
                if(instrucaoSQL != null) {
                    ConexaoBD.fecharConexao();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão do BD!");
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Produto> listar(){
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto");
            rs = instrucaoSQL.executeQuery();

            while(rs.next()) {
                Produto objLinha = new Produto();
                objLinha.setId(rs.getInt("id"));
                objLinha.setNome(rs.getString("nome"));
                objLinha.setDescricao(rs.getString("descricao"));
                objLinha.setQtd(rs.getInt("qtd"));
                objLinha.setPreco(rs.getDouble("preco"));
                listaRetorno.add(objLinha);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaRetorno = null;
        } finally {
            try {
                if(instrucaoSQL != null) {
                    ConexaoBD.fecharConexao();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão do BD!");
            }
        }
        return listaRetorno;
    }
}

