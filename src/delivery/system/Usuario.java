package delivery.system;

class Usuario {
    private int ID;
    private String nome;
    private int cpf;
    private float saldo;

    public Usuario(int ID, String nome, int cpf) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0f;
    }

    public void adicionarSaldo(float valor) {
        saldo += valor;
    }

    public void removerSaldo(float valor) {
        saldo -= valor;
    }
}