package delivery.system;

class BalancoFinanceiro {
    private float saldo;
    private float entrada;
    private float saida;

    public BalancoFinanceiro() {
    }

    public BalancoFinanceiro(float saldo, float entrada, float saida) {
        this.saldo = saldo;
        this.entrada = entrada;
        this.saida = saida;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public float getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }

    public void adicionarSaldo(float valor) {
        saldo += valor;
        entrada += valor;
    }

    public void removerSaldo(float valor) {
        saldo -= valor;
        saida += valor;
    }

    public float calcularBalanco() {
        return entrada - saida;
    }
}
