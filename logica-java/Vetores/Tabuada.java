import java.util.Scanner;
public class Tabuada{
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n, m;
    System.out.print("informe o número para descobrimos sua tabuada");
    n = sc.nextInt();

        for(int i = 1; i < 11; i++){
            m = n * i;
            System.out.println("o resultado de " + n + " X " + i + " é igual a: " + m);
        }
        
        sc.close();
    }
}
