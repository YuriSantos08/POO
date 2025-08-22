public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("ISBN: " + isbn);

        if (autor != null) {
            autor.mostrarDetalhes();
        } else {
            System.out.println("Autor não informado.");
        }

        System.out.println(); // linha em branco para separar livros
    }
}
