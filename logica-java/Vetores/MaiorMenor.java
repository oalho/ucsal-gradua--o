import java.util.Scanner;
public class MaiorMenor{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        
    int[] vetor = new int[12];
    int maior = Integer.MIN_VALUE, menor = Integer.MIN_VALUE;    

    System.out.print("por favor, informe os números desejados para o vetor");
    
    for (int i = 0; i < vetor.length; i++){
        vetor[i] = sc.nextInt();
        
        if (vetor[i] > maior){
            maior = vetor[i];
        }
    
        if (vetor[i] < menor){
            menor = vetor[i];
        }
    }

    System.out.println("o maior número dessa sequência é: " + maior);
     System.out.println("o menor número dessa sequência é: " + menor);

    sc.close();
    }
}
