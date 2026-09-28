import java.util.Scanner;

public class Nadador{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int idade;
        
    System.out.print("informe a idade do nadador");
    idade = sc.nextInt();
    
    if (idade >= 8&& idade < 10){
        System.out.println("o nadador está na categoria infantil");
    }else if (idade >= 11 && idade < 13){
        System.out.println("o nadador está na categoria juvenil A");
    }else if (idade >= 14 && idade < 17){
        System.out.println("o nadador está na categoria juvenil B");
    }else {
        System.out.println("o nadador está na categoria sênior");
    }
    
    sc.close();   
    }
}
