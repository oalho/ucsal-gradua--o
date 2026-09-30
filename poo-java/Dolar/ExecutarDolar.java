package POO5Dolar;
import java.util.Scanner;

public class ExecutarDolar {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ola! Informe quantos dólares deseja obter");

        Dolar d = new Dolar();

        d = scan.nextDouble();
        
sc.close();
    }
}
