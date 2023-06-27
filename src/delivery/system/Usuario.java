package delivery.system;

public class Usuario {
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

    public Usuario() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void adicionarSaldo(float valor) {
        saldo += valor;
    }

    public void removerSaldo(float valor) {
        saldo -= valor;
    }
}
