package CarrinhodeCompras;

public class Item {
    private Integer quantidade;
    private Produto produto;

    public Item (Integer quantidade){
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Float subtotal(){        
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "Item [quantidade=" + quantidade + ", produto=" + produto + "]";
    }

}
