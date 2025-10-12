public abstract class Animal {
    protected  String nome;

    public Animal (String nome) {

        this.nome = nome;
    }

    public  void dormir () {
        System.out.println("O animal " + getNome() + " está dormindo ...");
    }

    public abstract void fazerSom();

    public void exibirDetalhes() {
        System.out.println("O animal " + nome + " está dormindo ...");
        fazerSom();
    }

    public String getNome() {
        return nome;
    }
}
