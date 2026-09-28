package POO4Notas;
import java.util.Scanner;
public class ExecutarNotas{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        Notas n = new Notas();

        System.out.println("Informe o nome do aluno");
        n.setNome(scan.nextLine());
        System.out.println("Informe a primeira nota");
        n.setN1(scan.nextInt());
        System.out.println("Informe a segunda nota");
        n.setN2(scan.nextInt());
        System.out.println("Informe a terceira nota");
        n.setN3(scan.nextInt());

        if (n.final() >= 60){
            System.out.println("Nota final:" + n.final());
            System.out.println("Aprovado");
        } else {
            System.out.println("Nota final: " + n.final());
            System.out.println("Reprovado");
            System.out.println("Faltaram " + n.minimo() + " pontos");
        }

    scan.close();
    }
}