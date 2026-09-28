import java.util.Scanner;
public class Mes{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int mes;
    
    System.out.print("digite um número de 1 a 12 e o sistema te informará o mês correspondente");
    mes = sc.nextInt();

    switch (mes){
        case 1: System.out.println("o mês selecionado é: janeiro"); break;
        case 2: System.out.println("o mês selecionado é: fevereiro"); break;
        case 3: System.out.println("o mês selecionado é: março"); break;
        case 4: System.out.println("o mês selecionado é: abril"); break;
        case 5: System.out.println("o mês selecionado é: maio"); break;
        case 6: System.out.println("o mês selecionado é: junho"); break;
        case 7: System.out.println("o mês selecionado é: julho"); break;
        case 8: System.out.println("o mês selecionado é: agosto"); break;
        case 9: System.out.println("o mês selecionado é: setembro"); break;
        case 10: System.out.println("o mês selecionado é: outubro"); break; 
        case 11: System.out.println("o mês selecionado é: novembro"); break;
        case 12: System.out.println("o mês selecionado é: dezembro"); break;       
    }

sc.close();
    }
}
