package RoundRobin;
import java.util.LinkedList; 
import java.util.Queue;

public class EscalonadorRoundRobin { 
    public static void main(String[] args) { 

        int quantum = 4; 
        Queue<Processo> filaProntos = new LinkedList<>();

        filaProntos.add(new Processo("P1", 24));
        filaProntos.add(new Processo("P2", 3));
        filaProntos.add(new Processo("P3", 3));

        int tempoTotal = 0;

        double totalTurnaround = 0;
        double totalEspera = 0;
        int quantidadeProcessos = filaProntos.size();

        System.out.println("--- Execução Round-Robin (Quantum = " + quantum + "ms) ---");

        while (!filaProntos.isEmpty()) {
            Processo atual = filaProntos.poll();

            if (atual.tempoRestante > quantum) {
                tempoTotal += quantum;
                atual.tempoRestante -= quantum;
                
                System.out.println("Tempo " + tempoTotal + "ms: " + atual.id + " executou por " + quantum + "ms (Restante: " + atual.tempoRestante + "ms)");

                filaProntos.add(atual);
                
            } else { 
                tempoTotal += atual.tempoRestante;
                
                System.out.println("Tempo " + tempoTotal + "ms: " + atual.id + " finalizou execução (Executou " + atual.tempoRestante + "ms restantes)");

                int turnaroundDoProcesso = tempoTotal;
                int esperaDoProcesso = turnaroundDoProcesso - atual.tempoPicoOriginal;
                
                totalTurnaround += turnaroundDoProcesso;
                totalEspera += esperaDoProcesso;

                atual.tempoRestante = 0;
            }
        }

        System.out.println("\nTodos os processos foram concluidos em " + tempoTotal + " ms.");

        System.out.printf("Tempo Médio de Turnaround (Retorno): %.2f ms\n", (totalTurnaround / quantidadeProcessos));
        System.out.printf("Tempo Médio de Espera: %.2f ms\n", (totalEspera / quantidadeProcessos));
        System.out.println("-------------------------------------------");
    }
}
