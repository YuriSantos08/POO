public class Pessoa {

    private String nome;
    private double peso;
    private double altura;


    double imc() {
        return peso/(altura*altura);
    }

    void mostrarDados() {
        String mensagem = "Detalhes da Pessoa:";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("IMC:  " + imc());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
