import java.util.Scanner;
public class Icm{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    double h, peso = 0;
    String sexo;

    System.out.print("digite altura");
    h = sc.nextInt();

    System.out.print("digite seu sexo (masculino, feminino)");
        sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("masculino")) {
            peso = (72.7 * h) - 44.7;
        }else if (sexo.equalsIgnoreCase("feminino")){
            peso = (62.1 * h) - 44.7;
        }

    System.out.println("o seu peso ideal é " + peso);
    sc.close();
    }
}
