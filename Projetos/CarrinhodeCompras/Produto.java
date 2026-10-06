package CarrinhodeCompras;

public class Produto {
    private String nome;
    private Integer codigo;
    private Float preco;

    public Produto(String nome, Integer codigo, Float preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + "]";
    }

}
