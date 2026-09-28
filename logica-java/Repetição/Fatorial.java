import java.util.Scanner;
public class Fatorial {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n, fat = 0;

    System.out.println("informe o número a ser calculado o fatorial");    
    n = sc.nextInt();
    
    for(int i = n - 1; i >= 1; i--){
        fat = n*i;
    }

    System.out.println("o fatorial é: " + fat);
sc.close();
    }
}
