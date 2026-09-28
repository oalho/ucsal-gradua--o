package POO7Pensionato;
public class Quarto{
    private int n;
    private Estudante estudante;

    public Quarto(int n){
        this.n = n;
        this.estudante = null;
    }

    public int getN() {
        return n;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public boolean ocupado(){
        return this.estudante != null;
    }
}