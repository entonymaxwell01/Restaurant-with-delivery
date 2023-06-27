package delivery.system;
import java.util.ArrayList;
import java.util.List;


class Cliente extends Usuario {
    private String endereco;
    private String telefone;
    private List<Avaliacao> avaliacoes;
    private List<Pedido> pedidos;

    public Cliente(int ID, String nome, int cpf) {
        super(ID, nome, cpf);
        this.endereco = "";
        this.telefone = "";
        this.avaliacoes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Cliente(int ID, String nome, int cpf, String endereco, String telefone) {
        super(ID, nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
        this.avaliacoes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void avaliarPedido(Pedido pedido, String comentario, String autor, int numEstrelas) {
        Avaliacao avaliacao = new Avaliacao(comentario, autor, numEstrelas);
        pedido.adicionarAvaliacao(avaliacao);
        avaliacoes.add(avaliacao);
    }

    public List<Avaliacao> listarAvaliacoes() {
        return avaliacoes;
    }
}

