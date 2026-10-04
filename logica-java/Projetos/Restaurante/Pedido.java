package Restaurante;
import java.util.List;
import java.util.ArrayList;

public class Pedido{
    private String data;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();

    public Pedido(String data, Cliente cliente){
        this.data = data;
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item){
        itens.add(item);
    }

    public Float total(){
        float total = 0;

        for(Item obj: itens){
            total += obj.subtotal();
        }

        return total;
    }

    @Override
    public String toString() {
        return "data: " + data + ", cliente: " + cliente + ", itens: " + itens + "";
    }

    
}