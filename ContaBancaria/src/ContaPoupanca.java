public class ContaPoupanca extends Conta implements OperacoesBancarias {

    double rendimento = 0.003;

    public ContaPoupanca(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    @Override
    public void sacar(double saque) throws SaldoException {
        super.sacar(saque);
    }

    @Override
    public void depositar(double valor) throws SaldoException {
        super.depositar(valor);
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: R$ " + getSaldo());
    }

    @Override
    public void atualizarSaldo() {
        double novoSaldo = getSaldo() + (getSaldo() * rendimento);
        try {
            depositar(getSaldo() * rendimento);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar saldo da Conta Poupança: " + e.getMessage());
        }
    }
}
