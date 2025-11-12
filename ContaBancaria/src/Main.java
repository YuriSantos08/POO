
public class Main {
    public static void main(String[] args) {

        // Criando contas
        ContaCorrente cc = new ContaCorrente("Yuri", "123", 1000);
        ContaPoupanca cp = new ContaPoupanca("Maria", "456", 500);
        try {


            // Operações
            cc.depositar(200); // depósito
            cc.sacar(100);     // saque com taxa
            cc.transferir(cp, 300); // transferência

            // Atualizar saldo da poupança (rendimento)
            cp.atualizarSaldo();

            // Extratos
            cc.imprimirExtrato();
            cp.imprimirExtrato();

        } catch (SaldoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}