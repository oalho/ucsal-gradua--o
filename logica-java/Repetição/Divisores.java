import java.util.Scanner;
public class Divisores{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.print("informe o número e exibiremos os divisores possíveis");
    int n = sc.nextInt();
    
    for (int i = 1; i <= n; i++){
        if (n / i == 0){
            System.out.println(i + "é divisor de " + n);
        }    
    } 

sc.close();
    }
}
