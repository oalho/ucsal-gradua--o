import java.util.Scanner;
public class NumerosPrimos{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        int n;
        boolean primo = false;
    System.out.print("informe números e validaremos se é primo ou não");
    System.out.print("digite -1 para interromper a leitura e mostrar o resultado");

    do{
        n = sc.nextInt();
        
        if ((n / 2 != 0) && (n / 3 != 0)){
            System.out.println(n + " é primo!");
        } else {
            System.out.println(n + " não é primo");
        }   
            
    } while (n != -1);    

sc.close();
    }
}
