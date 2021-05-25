package br.senac.sp.pi.controller;

import br.senac.sp.pi.dao.ClienteDAO;
import br.senac.sp.pi.model.Cliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Fabricio Belomo
 */
public class ClienteController {

    public static boolean salvar(Cliente c) throws ClassNotFoundException {
        if (c == null) {
            System.out.println("Cliente Inválido!");
            return false;
        }
        return ClienteDAO.salvar(c);
    }

    public static boolean alteracaoSalvar(Cliente c) throws ClassNotFoundException {
        if (c == null) {
            System.out.println("Cliente Inválido!");
            return false;
        }

        if (c.getId() == 0) {
            System.out.println("Id de cliente inválido!");
            return false;
        }
        return ClienteDAO.alteracaoSalvar(c);
    }

    public static boolean exclusao(int idCliente) throws ClassNotFoundException {
        if (idCliente == 0) {
            System.out.println("Id de cliente inválido!");
        }
        return ClienteDAO.exclusao(idCliente);
    }

    public static ArrayList<String[]> pesquisaPorNomeOuCpf(String nome, String cpf) {
        if (nome == null) {
            nome = "";
        }

        if (cpf == null) {
            cpf = "";
        }

        ArrayList<Cliente> listaCliente = ClienteDAO.pesquisaPorNomeOuCpf(nome, cpf);
        ArrayList<String[]> listaRetorno = new ArrayList<>();

        for (Cliente item : listaCliente) {
            listaRetorno.add(new String[]{String.valueOf(item.getId())
                                        ,String.valueOf(item.getNome())
                                        ,String.valueOf(item.getCpf())
                                        ,String.valueOf(item.getTelNumber())
                                        ,String.valueOf(item.getEmail())
                                        ,String.valueOf(item.getDataNascimento())
                                        ,String.valueOf(item.getEstadoCivil())
                                        ,String.valueOf(item.getEndereco())
                                        ,String.valueOf(item.getComplemento())
                                        ,String.valueOf(item.getCep())
                                        ,String.valueOf(item.getCidade())
                                        ,String.valueOf(item.getUf())
            });
        }
        return listaRetorno;
    }

    public static ArrayList<String[]> listar() {
        ArrayList<Cliente> listaCliente = ClienteDAO.listar();
        ArrayList<String[]> listaRetorno = new ArrayList<>();

        for (Cliente item : listaCliente) {
            SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd-MM-yyyy");
            listaRetorno.add(new String[]{String.valueOf(item.getId())
                                        ,String.valueOf(item.getNome())
                                        ,String.valueOf(item.getCpf())
                                        ,String.valueOf(item.getTelNumber())
                                        ,String.valueOf(item.getEmail())
                                        ,String.valueOf(formatadorDatas.format(item.getDataNascimento()))
                                        ,String.valueOf(item.getEstadoCivil())
                                        ,String.valueOf(item.getEndereco())
                                        ,String.valueOf(item.getComplemento())
                                        ,String.valueOf(item.getCep())
                                        ,String.valueOf(item.getCidade())
                                        ,String.valueOf(item.getUf())
            });
        }
        return listaRetorno;
    }
}
