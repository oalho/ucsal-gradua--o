import java.sql.Date;

public class Cadastro{
    private String nome;
    private String email;
    private Date nascimento;
    private String numero;

    public Cadastro(String nome, String email, Date nascimento, String numero){
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.numero = numero;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}