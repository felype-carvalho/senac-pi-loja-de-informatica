package br.senac.sp.pi.controller;

import br.senac.sp.pi.model.Venda;
import br.senac.sp.pi.model.ItemVenda;
import br.senac.sp.pi.dao.VendaDAO;
import java.util.ArrayList;

/**
 * @author Fabricio
 */
public class VendaController {

    public static boolean salvar(Venda v, ArrayList<ItemVenda> iv) throws ClassNotFoundException {
        if (v == null) {
            System.out.println("Venda Inválida!");
            return false;
        }

        if (iv == null || iv.size() == 0) {
            System.out.println("ItemVenda Inválido!");
            return false;
        }

        return VendaDAO.salvar(v, iv);
    }
}
