
package br.senac.sp.pi.model;

/**
 *
 * @author Gabriela
 */
public class Produto 
{   
    private int idProduto;
    private String nome, descricao;
    private int qtd;
    private double preco;
    
    
     public int getIdProduto() 
    {
        return idProduto;
    }

    public void setIdProduto(int idProduto) 
    {
        this.idProduto = idProduto;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getQtd() 
    {
        return qtd;
    }

    public void setQtd(int qtd) 
    {
        this.qtd = qtd;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }
    
}
