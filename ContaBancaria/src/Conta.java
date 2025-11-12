public abstract class Conta {

    private String titular;
    private String numero;
    private double saldo;

    public abstract void atualizarSaldo();

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) throws SaldoException {
        if (valor <= 0) {
            throw new SaldoException("Valor inválido! O valor do depósito deve ser maior que zero.");
        }
        saldo += valor;
        System.out.println("Deposito realizado com sucesso! Saldo atual: " + saldo );
    }

    public void sacar(double saque) throws SaldoException {
        if (saque <= 0) {
            throw new SaldoException("Valor de saque inválido! Deve ser maior que zero.");
        }
        if (saque > saldo) {
            throw new SaldoException("Saldo insuficiente! Saldo atual: " + saldo + " | Valor solicitado: " + saque);
        }
        saldo -= saque;
        System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

}
