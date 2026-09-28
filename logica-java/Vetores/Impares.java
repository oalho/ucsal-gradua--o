import java.util.Scanner;
public class Impares {
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int[] vet = new int[10];

    System.out.print("escreva 10 números e averiguaremos quais destes são primos");
    
    for(int i = 0; i < vet.length; i++){
        vet[i] = sc.nextInt();
        if (vet[i] / 2 != 0){
            System.out.println(vet[i] + " é impar!");
        }
    }

sc.close();
    }
}
