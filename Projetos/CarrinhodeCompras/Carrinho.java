package CarrinhodeCompras;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    private Cliente cliente;
    private List <Item> itens = new ArrayList<>();

    public Carrinho (Cliente cliente){
        this.cliente = cliente;
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

    @Override
    public String toString() {
        return "Carrinho [cliente=" + cliente + ", itens=" + itens + "]";
    }

}
