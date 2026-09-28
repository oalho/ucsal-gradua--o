import java.util.Scanner;
public class Velocidade{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    float km, ms;

    System.out.print("digite a velocidade do veiculo");
    km = sc.nextFloat();
    ms = km / 3.6f;
    System.out.println("a velocidade convertida para metros por segundo é: " + ms);   

    sc.close();
    }
}
