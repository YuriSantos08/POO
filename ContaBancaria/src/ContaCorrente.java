public class ContaCorrente  extends Conta implements OperacoesBancarias{

    private  double taxaSaque = 0.005;

    public ContaCorrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    @Override
    public void sacar(double saque) throws SaldoException {
        double valorComTaxa = saque + (saque * taxaSaque);
        super.sacar(valorComTaxa);
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: R$ " + getSaldo());
    }

    @Override
    public void atualizarSaldo() {
    }
}