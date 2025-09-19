public class Atleta extends Pessoa {

    private String esportePraticado;

    @Override
    double imc() {

        double imc = super.imc();
        double reducao = imc * 5 / 100;
        return imc - reducao;
    }

    void mostrarDados() {
        String mensagem = "Detalhes do Atleta:";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("IMC:  " + imc());
        System.out.println("EsportePraticado: " + getEsportePraticado());
    }
    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
