import java.util.Scanner;

public class Ascendente{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1, n2;

    System.out.print("digite os números");
    n1 = sc.nextInt();
    n2 = sc.nextInt();

    if (n1 < n2){
        System.out.println("a sequencia ascendente é: " + n1 + ", " + n2);
    }else{
        System.out.println("a sequencia ascendente é: " + n2 + ", " + n1);
        }
    sc.close();
    }
}
