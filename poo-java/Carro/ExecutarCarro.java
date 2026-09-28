package Carro;
import java.util.Scanner;
public class ExecutarCarro {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("cadastro de carro no sistema");
        
        System.out.println("informe o modelo do carro");
        String modelo = scan.nextLine();
        System.out.println("informe a marca do carro");
        String marca = scan.nextLine();
        System.out.println("informe a placa do carro");
        String placa = scan.nextLine(); 
        System.out.println("informe o ano do carro");
        int ano = scan.nextInt();
        System.out.println("informe o número(do chassi) do carro");
        int numero = scan.nextInt();

        Carro c = new Carro(modelo, marca, placa, ano, numero);

        System.out.println("Carro cadastrado!");

        System.out.println("Modelo: " + c.getModelo() + "| Marca: " + c.getMarca() + "| Placa: " + c.getPlaca() + "| Ano: " + c.getAno() + "| Número do Chassi: " + c.getNumero());
    
    scan.close();
    }
}
