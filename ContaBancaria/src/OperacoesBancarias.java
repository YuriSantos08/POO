public interface OperacoesBancarias {
    void transferir(Conta destino, double valor) throws SaldoException;
    void imprimirExtrato();
}
