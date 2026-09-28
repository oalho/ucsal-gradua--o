import java.util.Scanner;
public class EncontrarN{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int[] vetor = new int[10];
    int n;
    boolean encontrou = false;

    System.out.print("digite o vetor");

    for (int i = 0; i < vetor.length; i++){
        vetor[i] = sc.nextInt();
    }

    System.out.println("agora informe o número que vc quer verificar se existe no vetor");
    n = sc.nextInt();

    for (int i = 0; i < vetor.length; i++){        
        if (n == vetor[i]) {
            encontrou = true;
            System.out.println("o número existe no vetor");
        } else {
            System.out.println("o número não existe no vetor");
       }    
    }

    sc.close();
    }
}
