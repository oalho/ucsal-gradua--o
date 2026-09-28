package Carro;

public class Carro {
    private String modelo, placa, marca;
    private int numero, ano;

    public Carro(String modeloCarro, String marcaCarro, String placaCarro, int anoCarro, int numeroCarro){
        modelo = modeloCarro;
        placa = placaCarro;
        marca = marcaCarro;
        numero = numeroCarro;
        ano = anoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
