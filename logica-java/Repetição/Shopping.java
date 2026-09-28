import java.util.Scanner;
public class Shopping{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int age, code, servicos, man, mule;
    char sex;    

    System.out.print("funcionário, digite essas informações do cliente para a  pesquisa:"); 
    
    do { 
    System.out.print("1 - Compras; 2 - Serviços; 3 - Lazer; 4 - Alimentação");    
    code = sc.nextInt();

    if (code == 5){
        break;
    }

    System.out.print("Informe a idade e o sexo, respectivamente");
        age = sc.nextInt();
        sex = sc.next().charAt(0);


    } while (code != 5);

sc.close();
    }
}
