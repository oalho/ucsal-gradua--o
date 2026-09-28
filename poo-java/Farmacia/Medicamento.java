package Farmacia;

public class Medicamento {
    private String nome;
    private float preco;
    private int quantidadeEstoque;

    public Medicamento(String nome, float preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void entrada(int adicionados){
        quantidadeEstoque += adicionados;
    }
    

    public void retirada(int retirados){
        quantidadeEstoque -= retirados;
    }

    public float valorTotalEstoque(){
        return preco * quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


}
