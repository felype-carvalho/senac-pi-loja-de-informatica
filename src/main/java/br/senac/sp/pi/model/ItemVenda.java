package br.senac.sp.pi.model;

/**
 * @Fabricio
 */
public class ItemVenda {

    private int id;

    private int idVenda;

    private int idProduto;

    private int qtdVenda;

    private double valorUnitVenda;

    public ItemVenda() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public double getValorUnitVenda() {
        return valorUnitVenda;
    }

    public void setValorUnitVenda(double valorUnitVenda) {
        this.valorUnitVenda = valorUnitVenda;
    }
}
