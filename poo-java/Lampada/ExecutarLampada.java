package Lampada;
import java.util.Scanner;
public class ExecutarLampada {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        Lampada l = new Lampada();

        System.out.println("Informe a cor da lampada");
        l.setCor(scan.nextLine());

        System.out.println("gostaria de ligar ou desligar a lampada?");
        String r = scan.nextLine();

        if (r.equalsIgnoreCase("ligar")){
            l.liga();
        } else if (!r.equalsIgnoreCase("ligar")){
            l.desliga();
        }  
        
        if (l.estadoLampada() == false){
            System.out.println("Estado da lâmpada " + l.getCor() + ": desligada");
        } else if (l.estadoLampada() == true){
            System.out.println("Estado da lâmpada " + l.getCor() + ": ligada");
        }

    scan.close();
    } 
}
