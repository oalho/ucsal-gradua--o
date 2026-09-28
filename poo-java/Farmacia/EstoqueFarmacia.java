package Farmacia;
import java.util.Scanner;
public class EstoqueFarmacia {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        String r;

        System.out.println("---Farmácia Popular---");
        System.out.println("Informe o nome do Remédio que quer cadastrar");
        String nome = scan.nextLine();
        System.out.println("Informe o preço unitário do remédio");
        float preco = scan.nextFloat();
        System.out.println("Informe quantos há no estoque");
        int quantidadeEstoque = scan.nextInt();

        Medicamento m = new Medicamento(nome, preco, quantidadeEstoque);

        scan.nextLine();

        do{

            System.out.println("Deseja adicionar mais no estoque, remover ou parar?");
             r = scan.nextLine();
            
            if(r.equalsIgnoreCase("adicionar")){
                System.out.println("Quantas unidades deseja adicionar?");
                int adicionados = scan.nextInt();
                m.entrada(adicionados);
                scan.nextLine();
            }

            if(r.equalsIgnoreCase("remover")){
                System.out.println("Quantas unidades deseja remover?");
                int retirados = scan.nextInt();
                m.retirada(retirados);
                scan.nextLine();
            }
        }while (!r.equalsIgnoreCase("parar"));

        System.out.println("Nome: " + m.getNome() + " | Preço: " + m.getPreco() + " | Quantidade: " + m.getQuantidadeEstoque() + "| Valor Total no Estoque: " + m.valorTotalEstoque());

    scan.close();
    }
}
