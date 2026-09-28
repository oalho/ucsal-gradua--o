import java.util.Scanner;
public class Multiplicacao{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] multiplos = new int[8];
    int total = 1;    

    System.out.print("informe uma sequenciade 8 números e multiplicaremos entre eles");

    for(int i = 0; i < multiplos.length; i++){
    multiplos[i] = sc.nextInt();    
    total = total * multiplos[i]; 
    }
    
    System.out.println("o total da multiplicação é " + total);

sc.close();
    }
}
