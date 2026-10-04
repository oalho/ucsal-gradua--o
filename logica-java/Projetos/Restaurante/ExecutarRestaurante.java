package Restaurante;
import java.util.Scanner;

public class ExecutarRestaurante {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao Restaurante da familia");
        System.out.println("Vamos iniciar com os dados do cliente");
        System.out.println("Nome:");
        String nome = scan.next();
        System.out.println("Email:");
        String email = scan.next();
        Cliente cliente = new Cliente(nome, email);
        System.out.println("Qual a data do pedido?");
        String data = scan.next();
        Pedido pedido = new Pedido(data, cliente);

        System.out.println("Quantos produtos vai adicionar?");
        int carrinhoCompras = scan.nextInt();

        for(int i = 0; i < carrinhoCompras; i++){
        System.out.println("Vamos ler os dados do produto");
        System.out.println("Nome:");
        String nomeProduto = scan.next();
        System.out.println("Código:");
        Integer codigoProduto = scan.nextInt();
        Produto produto = new Produto(nomeProduto, codigoProduto);

        System.out.println("Vamos ler os itens:");
        System.out.println("Quantidade:");
        Integer quantidadeItem = scan.nextInt();
        System.out.println("Preço");
        Float precoItem = scan.nextFloat();
        Item item = new Item(quantidadeItem, precoItem);

        pedido.addItem(item);
        }

        System.out.println("\n --Resumo do pedido -- ");
        System.out.println(pedido);
    scan.close();
    }
}
