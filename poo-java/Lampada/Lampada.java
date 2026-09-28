package Lampada;

public class Lampada {
    private boolean ligada = false;
    private String cor;

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
 
    public boolean estadoLampada(){
        return ligada;
    }

    public boolean liga(){
        return this.ligada = true;
    }

    public boolean desliga(){
        return this.ligada = false;
    }
}
