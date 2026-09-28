package RoundRobin;
 class Processo { 
    public String id; 
    public int tempoPico;
    public int tempoRestante;
    public int tempoPicoOriginal;
    
    public Processo(String id, int tempoPico) { 
        this.id = id; 
        this.tempoPico = tempoPico; 
        this.tempoRestante = tempoPico; 
        this.tempoPicoOriginal = tempoPico;
    } 
} 

