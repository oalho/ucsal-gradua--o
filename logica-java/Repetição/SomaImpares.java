import java.util.Scanner;
public class SomaImpares{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int s = 0, inicioIntervalo, fimIntervalo;
    
    System.out.println();
    System.out.println("digite o interalo");
        inicioIntervalo = sc.nextInt();
        fimIntervalo = sc.nextInt();
        
        for(int i = inicioIntervalo; i <= fimIntervalo; i++){
            if(i % 2 != 0){
                s = s + i;
            }
        }
    
    System.out.println();
    System.out.println("a soma dos números impares nesse intervalo é " + s);    
    
    
    sc.close();
    }
}
