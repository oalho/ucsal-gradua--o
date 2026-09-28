import java.util.Scanner;
public class VetoresABC{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] A = new int[8];
    int[] B = new int[8];  
    int[] C = new int[8];
    int i;
        
    System.out.print("escreva os 8 números do vetor A");
    for (i = 0; i < A.length; i++){
        A[i] = sc.nextInt();
    }    

    System.out.print("escreva os 8 números do vetor B");
    for (i= 0; i < B.length; i++){
        B[i] = sc.nextInt();
    }

    for (i = 0; i < C.length; i++){
        C[i] = A[i] + B[i];
    }
    
    System.out.println("o resultado final do vetor C é: " + C[8]);

sc.close();
    }
}
