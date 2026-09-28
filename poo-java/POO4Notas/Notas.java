package POO4Notas;
public class Notas{
    private String nome;
    private int n1, n2, n3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int final(){
        return (n1 + n2 + n3) / 3;
    }

    public int minimo(){
        return 60 - Notas.final();
    }
}