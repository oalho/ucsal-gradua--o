import java.util.Scanner;
public class Locadora{
    public static void main(String[]args){
        int fitasP, fitasI, per, clienteP, clienteI;
    Scanner sc = new Scanner (System.in);
        System.out.print ("quantas fitas estão em cada unidade?");
        fitasP = sc.nextInt();
        fitasI = sc.nextInt();
        clienteP = 2000 - fitasP;
        clienteI = 2000 - fitasI;
        per = (clienteP + clienteI) / 100;
        System.out.println("a quantidade de fitas com os clientes da Pituba e com os clientes de Itapuã são respectivamentes" + clienteP + ", " + clienteI);
        System.out.println("a porcentagem é " + per);
    
    sc.close();
    }
}
