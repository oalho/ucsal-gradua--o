import java.util.Scanner;
public class ParesImpares{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = 0, quanti = 0, quantp = 0;

    System.out.print("digite uma sequência. Descobriremos quantos números informados são pares e quantos são impares (Digite -1 para parar a contagem)");
    
    while(true){

        n = sc.nextInt();

        if(n == -1){
            break;
        }
        if (n % 2 != 0){
            quanti = quanti + 1;
        } else {
            quantp = quantp + 1;
        }
        
    }

    System.out.println ("a quantidade de números pares é: " + quantp + " e a quantidade de números impares é: " + quanti);

sc.close();
    }
}
