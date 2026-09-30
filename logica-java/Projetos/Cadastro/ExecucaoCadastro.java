import java.util.Scanner;
public class ExecucaoCadastro {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo ao cadastro");
        System.out.println("Informe seu nome");
        String nome = scan.next();
        System.out.println("Informe o email");
        String email = scan.next();
        System.out.println("Informe data de nascimento (AAAA-MM-DD)");
        String dataTexto = scan.next();
        java.sql.Date nascimento = java.sql.Date.valueOf(dataTexto);
        
        System.out.println("Informe o número de telefone");
        String numero = scan.next();

        Cadastro cadastro = new Cadastro(nome, email, nascimento, numero);
    
        System.out.println("\n--- Cadastro realizado com sucesso! ---");
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("E-mail: " + cadastro.getEmail());
        System.out.println("Nascimento: " + cadastro.getNascimento());
        System.out.println("Telefone: " + cadastro.getNumero());

    scan.close();
    }
}

