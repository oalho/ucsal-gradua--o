import java.util.Scanner;
public class Anagrama{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    char[] cadeia1 = new char[10];
    char[] cadeia2 = new char[10];    

    System.out.print("informe a sequencia de caraceres");    
    
    for (int i = 0; i < cadeia1.length; i++){
        cadeia1[i] = sc.next().charAt(0);
    }

    
    for (int i = 0; i < cadeia1.length; i++){
        cadeia2[i] = sc.next().charAt(0);
    }

    
    for (int i = 0; i < cadeia1.length; i++){
        if(cadeia1[i] == cadeia2[i]){
            
        }
    }

    sc.close();
    }
}
