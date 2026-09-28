import java.util.Scanner;
public class Hotel{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("qual função será realizada?");
    System.out.print("1 - Chek-in ; 2 - Serviço de quarto; 3 - Fazer pedido");
    int r = sc.nextInt();    

    switch (r){
        case 1: System.out.println("iniciaremos o check-in");
        case 2: System.out.println("iniciaremos o serviço de quarto");
        case 3: System.out.println("pode fazer o pedido");
    }

sc.close();
    }
}
