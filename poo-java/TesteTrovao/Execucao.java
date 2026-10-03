package TesteTrovao;
import java.util.Scanner;
import TesteTrovao.Produto;
import TesteTrovao.ItensNota;
import TesteTrovao.Cliente;
import TesteTrovao.NotaVenda;

public class Execucao{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados do cliente");
        System.out.println("Nome:");
        String nomeCliente = scan.nextLine();
        System.out.println("Email:");
        String emailCliente = scan.nextLine();
        System.out.println("Data de nascimento");
        String nascimentoCliente = scan.nextLine();
        Cliente cliente = new Cliente(nomeCliente, emailCliente, nascimentoCliente);

        System.out.println("Agora informe os dados contidos na Nota");
        System.out.println("Data da nota:");
        String dataNota = scan.nextLine();
        System.out.println("Número:");
        int numero = scan.nextInt();
        NotaVenda nota = new NotaVenda(dataNota, numero, cliente);

        System.out.println("Quantos itens estarão na nota?");
        int quant = scan.nextInt();
        
        for(int i = 0; i < quant; i++){
            scan.nextLine();
            System.out.println("Dados do produto " + i + 1 +":");
            System.out.println("Nome:");
            String nomeProduto = scan.next();
            System.out.println("Preço:");
            Double preco = scan.nextDouble();
            Produto produto = new Produto(nomeProduto, preco);
            System.out.println("Quantidade:");
            int quantidade = scan.nextInt();
            scan.nextLine();
            ItensNota item = new ItensNota(quantidade, preco, produto);
            nota.addItem(item);
        }

        System.out.println("\n --Resumo do Pedido--");
        System.out.println(nota);

    scan.close();
    }
}