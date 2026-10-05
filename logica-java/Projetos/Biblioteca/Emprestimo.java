package Biblioteca;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Leitor leitor;
    private List<Livro> livros = new ArrayList<>();

    public Emprestimo(String dataEmprestimo, String dataDevolucao, Leitor leitor){
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }


}
