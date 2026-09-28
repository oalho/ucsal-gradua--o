import java.util.Scanner;
public class ExecutarLivro {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        Livro l = new Livro();

        System.out.println("Bem vindo ao registro de livro! Informe os seguintes");
        System.out.println("Nome do livro:");
        l.setNomeLivro(scan.nextLine());
        System.out.println("Autor do livro:");
        l.setNomeAutor(scan.nextLine());
        System.out.println("Código do livro:");
        l.setCod(scan.nextInt());
        scan.nextLine();
        System.out.println("Gênero do livro:");
        l.setGenero(scan.nextLine());
        System.out.println("Quantas páginas o livro possui:");
        l.setPag(scan.nextInt());
        scan.nextLine();

        System.out.println("Pronto!Livro cadastrado!"); 

        System.out.println("Nome: " + l.getNomeLivro());
        System.out.println("Autor: " + l.getNomeAutor());
        System.out.println("Código: " + l.getCod());
        System.out.println("Gênero: " + l.getGenero());
        System.out.println("Número de páginas:" + l.getPag());
        
    scan.close();
    }
}
