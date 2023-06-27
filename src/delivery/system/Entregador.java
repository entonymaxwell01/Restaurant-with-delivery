package delivery.system;
import java.util.ArrayList;
import java.util.List;


public class Entregador extends Usuario {
    private List<Pedido> pedidos;

    public Entregador(int ID, String nome, int cpf) {
        super(ID, nome, cpf);
        this.pedidos = new ArrayList<>();
    }

    public Entregador(int ID, String nome, int cpf, List<Pedido> pedidos) {
        super(ID, nome, cpf);
        this.pedidos = pedidos;
    }

    public Entregador(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void confirmarEntrega(Pedido pedido) {
        pedido.concluirEntrega();
        pedidos.remove(pedido);
    }
}