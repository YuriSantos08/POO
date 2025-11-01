public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        try {
            contaBancaria.sacar(400);
            contaBancaria.sacar(1200);
        } catch (SaldoException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Operaçao finalizada!!");
        }

    }
}