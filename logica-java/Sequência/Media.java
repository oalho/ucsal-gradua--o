import java.util.Scanner;
public class Media{
    public static void main(String[]args){
        int precoA, precoB, precoC, media;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o preço do posto A");
        precoA = sc.nextInt();
        System.out.print("digite o preço do posto B");
        precoB = sc.nextInt();
        System.out.print("digite o preço do posto C");
        precoC = sc.nextInt();
        
        media = (precoA + precoB + precoC) / 3;
    
        System.out.println("a media é " + media);
        
    sc.close();
    }
}
