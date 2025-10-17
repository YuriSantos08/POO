public class Pato  implements  Voavel , Nadavel{
    private String nome;

    public Pato (String nome) {
        this.nome = nome;
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando á " + VELOCIDADE_MAXIMA + "km/h.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " esta voando " + ALTITUDE_MAXIMA + " metros acima do solo. ");
    }
}
