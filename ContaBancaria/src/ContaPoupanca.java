public class ContaPoupanca extends Conta implements OperacoesBancarias {

    double renda = 0.003;

    public ContaPoupanca(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }



    @Override
    public void transferir(Conta destino, double valor) throws SaldoException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: R$ " + getSaldo());
    }

    @Override
    public void atualizarSaldo()  {
        double rendimento = getSaldo() * renda;
        try {
            depositar(rendimento);
        } catch (SaldoException e) {
            System.out.println("Erro ao atualizar saldo: " + e.getMessage());
        }
    }
}
