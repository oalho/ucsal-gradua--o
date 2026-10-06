package CarrinhodeCompras;
import java.util.Scanner;

public class Execucao {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao mercado. Vamo iniciar seu carrinho online");
        System.out.println("Informe seu nome");
        String nome = scan.next();
        System.out.println("Informe o cpf");
        String cpf = scan.next();
        System.out.println("Informe o email");
        String email = scan.next();
        Cliente cliente = new Cliente(nome, cpf, email);
        Carrinho carrinho = new Carrinho(cliente);

        System.out.println("Informe quantos produtos deseja adicionar ao seu carrinho");
        int produtos = scan.nextInt();

        for (int i = 0; i < produtos; i++){
            System.out.println("nome do produto " + i + 1);
            String nomeProduto = scan.next();
            System.out.println("Código do produto");
            Integer codigo = scan.nextInt();
            System.out.println("Preço do produto");
            Float preco = scan.nextFloat();
            Produto produto = new Produto(nomeProduto, codigo, preco);

            System.out.println("Quantas unidades deste produto deseja?");
            Integer quantidade = scan.nextInt();

            Item item = new Item(quantidade);
            
            carrinho.addItem(item);
        }

        System.out.println("Pedido finalizado");
        System.out.println(carrinho);

    scan.close();
    }
}
