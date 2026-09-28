import java.util.Scanner;
public class MenorNumero {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n, menor = 0;
    
    System.out.print("informe uma senquencia de números e iremos medir qual é o de menor valor");
    n = sc.nextInt();

    if (n != 0){
        do {
            if (n < menor){
                menor = n;        
            }
        } while (n != 0);
    }
    
    System.out.println("o menor número é: " + menor);
    
    sc.close();
    }
}
