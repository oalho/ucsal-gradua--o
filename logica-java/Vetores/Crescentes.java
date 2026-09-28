import java.util.Scanner;
public class Crescentes{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] vet1 = new int[10];
    int[] vet2 = new int[10];
    int[] vet3 = new int[20];    
    int i;    

    System.out.print("digite os valores de vet1");
    for (i = 0; i < vet1.length; i ++){
        vet1[i] = sc.nextInt();
    }    
       
    System.out.print("digite os valores de vet2");
    for (i = 0; i < vet2.length; i ++){
        vet2[i] = sc.nextInt();
    }    

    for (i = 0; i < vet3.length; i++){
        vet3[2 * i] = vet1[i];
        vet3[2 * i + 1] = vet2[i];
    }

    System.out.println("o vetor final é: " + vet3[i]);
sc.close();
    }
}
