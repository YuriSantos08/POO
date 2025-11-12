public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Yuri", "63046-2", 1500);
        ContaPoupanca cp = new ContaPoupanca("Maria", "63046-5", 500);
        try {
            cc.depositar(200);
            cc.sacar(100);
            cc.transferir(cp, 300);

            cc.atualizarSaldo();

            cp.depositar(200);
            cp.sacar(200);
            cp.transferir(cc, 300);


            cp.atualizarSaldo();

            cc.imprimirExtrato();
            cp.imprimirExtrato();

        } catch (SaldoException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Operaçao finalizada!!");
        }
    }
}