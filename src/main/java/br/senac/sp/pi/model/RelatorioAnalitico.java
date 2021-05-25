package br.senac.sp.pi.model;

import java.util.ArrayList;

public class RelatorioAnalitico {

    private int idCliente;

    private ArrayList<Produto> produtosVenda;

    private String nomeCliente;

    private String nomeProduto;

    private int qtdTotalVenda;

    private double valorUniProduto;

    private double valorTotalProduto;

    private double valorTotalVenda;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Produto> getProdutosVenda() {
        return produtosVenda;
    }

    public void setProdutosVenda(ArrayList<Produto> produtosVenda) {
        this.produtosVenda = produtosVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdTotalVenda() {
        return qtdTotalVenda;
    }

    public void setQtdTotalVenda(int qtdTotalVenda) {
        this.qtdTotalVenda = qtdTotalVenda;
    }

    public double getValorUniProduto() {
        return valorUniProduto;
    }

    public void setValorUniProduto(double valorUniProduto) {
        this.valorUniProduto = valorUniProduto;
    }

    public double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
}
