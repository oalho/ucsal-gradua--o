package Biblioteca;

public class Leitor {
    private String nome;
    private String email;
    private Livro livro;

    public Leitor(String nome, String email, Livro livro){
        this.nome = nome;
        this.email = email;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    
}
