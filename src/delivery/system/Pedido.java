package delivery.system;
import java.util.ArrayList;
import java.util.List;


class Pedido {
    private int ID;
    private Cliente clientePedido;
    private float valor;
    private Item[] itens;
    private List<Avaliacao> avaliacoes;
    private boolean entregaConcluida;

    public Pedido(int ID, Cliente clientePedido) {
        this.ID = ID;
        this.clientePedido = clientePedido;
        this.valor = 0.0f;
        this.itens = new Item[0];
        this.avaliacoes = new ArrayList<>();
        this.entregaConcluida = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }

    public float getValor() {
        return valor;
    }

    public void calcularValorPedido() {
        float total = 0.0f;
        for (Item item : itens) {
            total += item.getValor();
        }
        this.valor = total;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public boolean EntregaConcluida() {
        return entregaConcluida;
    }

    public void adicionarItemPedido(Item item) {
        Item[] novoItens = new Item[itens.length + 1];
        System.arraycopy(itens, 0, novoItens, 0, itens.length);
        novoItens[itens.length] = item;
        this.itens = novoItens;
    }

    public void editarItemPedido(int indice, Item novoItem) {
        if (indice >= 0 && indice < itens.length) {
            itens[indice] = novoItem;
        }
    }

    public void excluirItemPedido(int indice) {
        if (indice >= 0 && indice < itens.length) {
            Item[] novoItens = new Item[itens.length - 1];
            int j = 0;
            for (int i = 0; i < itens.length; i++) {
                if (i != indice) {
                    novoItens[j] = itens[i];
                    j++;
                }
            }
            this.itens = novoItens;
        }
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void concluirEntrega() {
        this.entregaConcluida = true;
    }

    public boolean isEntregaConcluida() {
        return entregaConcluida;
    }
}