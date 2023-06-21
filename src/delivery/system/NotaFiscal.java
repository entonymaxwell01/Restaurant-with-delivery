package delivery.system;
import java.util.ArrayList;
import java.util.List;


class NotaFiscal {
    private int ID;
    private String horario;
    private List<Pedido> pedidos;

    public NotaFiscal(int ID, String horario) {
        this.ID = ID;
        this.horario = horario;
        this.pedidos = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void gerarNotaFiscal(Pedido pedido) {
        pedidos.add(pedido);
    }
}