public class ContaBancaria {

    private double saldo = 1000;

    public void sacar(double saque) throws SaldoException {
        if (saque > saldo) {
            throw new SaldoException("Saldo insuficiente para realizar o saque " + " Saldo em conta: " + saldo + "   Valor do saque: " + saque);
        }else {
            double v = saldo - saque;
            System.out.println(" Saque realizado com sucesso!  Saldo atual: " + v);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
