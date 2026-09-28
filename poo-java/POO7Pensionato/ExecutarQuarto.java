package POO7Pensionato;
import java.util.Scanner;
public class ExecutarQuarto {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        Quarto q = new Quarto();

        System.out.printl("qual quarto sera alugado?");
        int r = scan.nextInt();


        for(int i = 0; i < 9; i++){
            if (vet[i]!= null){
                n[r] = q.estudante;
            }
        }

        System.out.println("Quartos ocupados: ");
        System.out.println(q + ": " + q.estudante);

    scan.close();    
    }
}
