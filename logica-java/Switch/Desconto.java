import java.util.Scanner;
public class Desconto {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        float v, vt = 0;
        int r;    

    System.out.println("qual o valor da compra?");
    v = sc.nextInt();

    System.out.println("o usuário é um cliente vip(1), funcionario(2) ou cliente comum(3)?");
        r = sc.nextInt();

    switch (r){
        case 1: vt = (v * 100)/ 5; break; 
        case 2: vt = (v * 100) / 10; break;
        case 3: vt = v; break;
    }

    System.out.println("o valor final da compra é: " + vt);

sc.close();
    }
}
