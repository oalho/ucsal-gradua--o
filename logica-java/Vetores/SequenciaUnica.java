import java.util.Scanner;
public class SequenciaUnica{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] sequence = new int[20];
    int[] newsequence = new int[20];
    boolean contem = false;
    int novaSequencia = 0;

    System.out.println("informe a sequência de 20 números e imprimiremos outra com os mesmos números, sem repeti-los");
    for (int i = 0; i < sequence.length; i++){
        sequence[i] = sc.nextInt();
    }

    for (int i = 0; i < sequence.length; i++){
        contem = false;
        
        for (int j = 0; j < novaSequencia; j++){
            if (sequence[i] == newsequence[j]){
                contem = true;
                break;
            }
        }
        
        if (!contem) {
            newsequence[novaSequencia] = sequence[i];
            novaSequencia++;
        }        
        
    }

    System.out.print("\nSequência original: ");
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }

        System.out.print("\nSequência sem repetições: ");
        for (int i = 0; i < novaSequencia; i++) { // Imprime apenas os números válidos inseridos
            System.out.print(newsequence[i] + " ");

        }

sc.close();
    }
}
