package br.senac.sp.pi.controller;

import br.senac.sp.pi.model.Produto;
import br.senac.sp.pi.dao.ProdutoDAO;
import java.util.ArrayList;

/**
 * @author Fabricio Belomo
 */
public class ProdutoController {

    public static boolean salvar(Produto p) throws ClassNotFoundException {
        if (p == null) {
            System.out.println("Produto Inválido!");
            return false;
        }
        return ProdutoDAO.salvar(p);
    }

    public static boolean alteracaoSalvar(Produto p) throws ClassNotFoundException {
        if (p == null) {
            System.out.println("Produto Inválido!");
            return false;
        }

        if (p.getId() == 0) {
            System.out.println("Id de produto inválido!");
            return false;
        }
        return ProdutoDAO.alteracaoSalvar(p);
    }

    public static boolean exclusao(int idProduto) throws ClassNotFoundException {
        if (idProduto == 0) {
            System.out.println("Id de produto inválido!");
        }
        return ProdutoDAO.exclusao(idProduto);
    }

    public static ArrayList<String[]> pesquisaPorNomeOuId(String nome, int id) {
        ArrayList<Produto> listaProduto = ProdutoDAO.pesquisaPorNomeOuId(nome, id);
        ArrayList<String[]> listaRetorno = new ArrayList<>();

        for (Produto item : listaProduto) {
            listaRetorno.add(new String[]{String.valueOf(item.getId())
                                        ,String.valueOf(item.getNome())
                                        ,String.valueOf(item.getDescricao())
                                        ,String.valueOf(item.getQtd())
                                        ,String.valueOf(item.getPreco()).replace(".",",")
            });
        }
        return listaRetorno;
    }

    public static ArrayList<String[]> listar() {
        ArrayList<Produto> listaProdutos = ProdutoDAO.listar();
        ArrayList<String[]> listaRetorno = new ArrayList<>();

        for (Produto item : listaProdutos) {
            listaRetorno.add(new String[]{String.valueOf(item.getId())
                                        ,String.valueOf(item.getNome())
                                        ,String.valueOf(item.getDescricao())
                                        ,String.valueOf(item.getQtd())
                                        ,String.valueOf(item.getPreco()).replace(".",",")
            });
        }
        return listaRetorno;
    }
}
