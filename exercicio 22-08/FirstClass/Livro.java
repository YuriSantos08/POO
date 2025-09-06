public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private  Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
    }
    void mostrarDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("ISBN: " + isbn);
    }
        boolean temAutor() {
        return autor != null;
        }

        public boolean aplicarDesconto(double porcetagem) {

        if(porcetagem > 20) {
            System.out.println("Desconto nao pode ser maior que 20%");
            return false;
        }
        this.valor -= this.valor * porcetagem / 100;
        return true;
        }
}
