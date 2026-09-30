package Restaurante;
public class Restaurante{
    private int nMesa, qtdR, cliente;
    private double qtKg, total, totalCliente;
    
    public int getnMesa() {
        return nMesa;
    }
    public void setnMesa(int nMesa) {
        this.nMesa = nMesa;
    }
    public int getQtdR() {
        return qtdR;
    }
    public void setQtdR(int qtdR) {
        this.qtdR = qtdR;
    }
    public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    public double getQtKg() {
        return qtKg;
    }
    public void setQtKg(double qtKg) {
        this.qtKg = qtKg;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotalCliente() {
        return totalCliente;
    }
    public void setTotalCliente(double totalCliente) {
        this.totalCliente = totalCliente;
    }

}