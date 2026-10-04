package Restaurante;

public class Item {
    private Integer quantidade;
    private Float preco;
    private Produto produto;

    public Item (Integer quantidade, Float preco){
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Float subtotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Quantidade: " + quantidade + ", preco: " + preco + ", produto: " + produto + "";
    }

    
}
