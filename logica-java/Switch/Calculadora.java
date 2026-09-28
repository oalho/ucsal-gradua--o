import java.util.Scanner;
public class Calculadora{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1, n2, r = 0, op;
    System.out.print("digite o primeiro número");
    n1 = sc.nextInt();
    System.out.print("digite o segundo número");
    n2 = sc.nextInt();
    System.out.print("agora digite a operação");
    System.out.print("1 - soma; 2 - subtração; 3 - multiplicação; 4 - divisão");
    op = sc.nextInt();

    switch (op) {
        case 1: r = n1 + n2; break;
        case 2: r = n1 - n2; break;
        case 3: r = n1 * n2; break;
        case 4: r = n1 / n2; break;
    }
    
    System.out.println("o resultado da operação é " + r);

sc.close();
    }
}
