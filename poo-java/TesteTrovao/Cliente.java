package TesteTrovao;
public class Cliente{
    private String nome;
    private String dataNascimento;
    private String email;

    public Cliente(String nome, String email , String dataNascimento){
        this.nome = nome;
        this.email = email;        
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
        return "Cliente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email + "]";
    }
}