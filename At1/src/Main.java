public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setAltura(1.77);
        pessoa.setPeso(83);

        System.out.println("----- Pessoa -----");
        pessoa.mostrarDados();

        Atleta atleta = new Atleta();
        System.out.println("\n----- Atleta -----");
        atleta.setNome("Yuri Alberto");
        atleta.setPeso(78);
        atleta.setAltura(1.82);
        atleta.setEsportePraticado("Futebol");

        atleta.mostrarDados();

    }
}