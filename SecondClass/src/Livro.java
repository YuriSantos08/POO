public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        // Construtor padrão necessário para funcionar com new Livro()
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("ISBN: " + isbn);
        if (autor != null) {
            autor.mostrarDetalhes(); // Mostra detalhes do autor junto com o livro
        }
    }

    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 20) {
            System.out.println("Desconto não pode ser maior que 20%");
            return false;
        }
        this.valor -= this.valor * porcentagem / 100;
        return true;
    }
}

