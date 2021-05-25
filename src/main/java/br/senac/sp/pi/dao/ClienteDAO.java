package br.senac.sp.pi.dao;

import br.senac.sp.pi.model.Cliente;
import br.senac.sp.pi.utils.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Fabricio Belomo
 */
public class ClienteDAO {

    public static boolean salvar(Cliente c) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome, cpf, numero_telefone, email, data_nascimento, estado_civil, endereco, complemento, cep, cidade, uf) " +
                                                    "VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            instrucaoSQL.setString(1, c.getNome());
            instrucaoSQL.setString(2, c.getCpf());
            instrucaoSQL.setString(3, c.getTelNumber());
            instrucaoSQL.setString(4, c.getEmail());
            instrucaoSQL.setDate(5, new java.sql.Date(c.getDataNascimento().getTime()));
            instrucaoSQL.setString(6, c.getEstadoCivil());
            instrucaoSQL.setString(7, c.getEndereco());
            instrucaoSQL.setString(8, c.getComplemento());
            instrucaoSQL.setString(9, c.getCep());
            instrucaoSQL.setString(10, c.getCidade());
            instrucaoSQL.setString(11, c.getUf());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    c.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Erro ao obter o ID do cliente!");
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

    public static boolean alteracaoSalvar(Cliente c) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET nome = ?, cpf = ?, numero_telefone = ?, email = ?, data_nascimento = ?, estado_civil = ?, " +
                                                                        "endereco = ?, complemento = ?, cep = ?, cidade = ?, uf = ? " +
                                                    "WHERE id = ?");
            instrucaoSQL.setString(1, c.getNome());
            instrucaoSQL.setString(2, c.getCpf());
            instrucaoSQL.setString(3, c.getTelNumber());
            instrucaoSQL.setString(4, c.getEmail());
            instrucaoSQL.setDate(5, new java.sql.Date(c.getDataNascimento().getTime()));
            instrucaoSQL.setString(6, c.getEstadoCivil());
            instrucaoSQL.setString(7, c.getEndereco());
            instrucaoSQL.setString(8, c.getComplemento());
            instrucaoSQL.setString(9, c.getCep());
            instrucaoSQL.setString(10, c.getCidade());
            instrucaoSQL.setString(11, c.getUf());
            instrucaoSQL.setInt(12, c.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    c.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Erro ao obter o ID do cliente!");
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

    public static boolean exclusao(int idCliente) throws ClassNotFoundException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id = ?");
            instrucaoSQL.setInt(1, idCliente);

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

    public static ArrayList<Cliente> pesquisaPorNomeOuCpf(String nome, String cpf) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome like ? OR cpf like ?");

            if (nome.equals("") && cpf.trim().length() == 9) {
                instrucaoSQL.setString(1, "%" + nome + "%");
                instrucaoSQL.setString(2, "%" + cpf + "%");
            } else if (nome.equals("")) {
                instrucaoSQL.setString(1, nome);
                instrucaoSQL.setString(2, "%" + cpf + "%");
            } else if (cpf.trim().length() == 9) {
                instrucaoSQL.setString(1, "%" + nome + "%");
                instrucaoSQL.setString(2, cpf);
            }

            rs = instrucaoSQL.executeQuery();

            while(rs.next()) {
                Cliente objLinha = new Cliente();
                objLinha.setId(rs.getInt("id"));
                objLinha.setNome(rs.getString("nome"));
                objLinha.setCpf(rs.getString("cpf"));
                objLinha.setTelNumber(rs.getString("numero_telefone"));
                objLinha.setEmail(rs.getString("email"));
                objLinha.setDataNascimento(new java.util.Date(rs.getDate("data_nascimento").getTime()));
                objLinha.setEstadoCivil(rs.getString("estado_civil"));
                objLinha.setEndereco(rs.getString("endereco"));
                objLinha.setComplemento(rs.getString("complemento"));
                objLinha.setCep(rs.getString("cep"));
                objLinha.setCidade(rs.getString("cidade"));
                objLinha.setUf(rs.getString("uf"));
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

    public static ArrayList<Cliente> listar(){
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        try {
            conexao = ConexaoBD.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente");
            rs = instrucaoSQL.executeQuery();

            while(rs.next()) {
                Cliente objLinha = new Cliente();
                objLinha.setId(rs.getInt("id"));
                objLinha.setNome(rs.getString("nome"));
                objLinha.setCpf(rs.getString("cpf"));
                objLinha.setTelNumber(rs.getString("numero_telefone"));
                objLinha.setEmail(rs.getString("email"));
                objLinha.setDataNascimento(new java.util.Date(rs.getDate("data_nascimento").getTime()));
                objLinha.setEstadoCivil(rs.getString("estado_civil"));
                objLinha.setEndereco(rs.getString("endereco"));
                objLinha.setComplemento(rs.getString("complemento"));
                objLinha.setCep(rs.getString("cep"));
                objLinha.setCidade(rs.getString("cidade"));
                objLinha.setUf(rs.getString("uf"));
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
