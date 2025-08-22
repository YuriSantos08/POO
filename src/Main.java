
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Joaozin";
        autor.cpf = "4455871-99";
        autor.email = "jaozin34@gmail.com";

        autor.mostrarDetalhes();

        Livro livro = new Livro();
        livro.nome = "O Senhor dos Aneis";
        livro.descricao = "Uma história de fantasia";
        livro.valor = 200.0;
        livro.isbn = "123-456-78-9";
        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Leandro";
        outroAutor.email = "Leandro22@gmail.com";
        outroAutor.cpf = "887965-98";

        Livro outrolivro = new Livro();
        outrolivro.nome = "O Pequeno Príncipe";
        outrolivro.descricao = "Uma história de fantasia 2";
        outrolivro.valor = 100.0;
        outrolivro.isbn = "123-456-56-9";
        outrolivro.autor = outroAutor;

        outrolivro.mostrarDetalhes();
    }
}
