//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("J.R.R. Tolkien");
        autor.setEmail("jrrtolkien@gmail.com");
        autor.setCpf("123456789");

        Livro livro1 = new Livro();
        livro1.setnome("O senhor dos aneis");
        livro1.setDescricao("Livro de fantasia");
        livro1.setValor(400);
        livro1.setIsbn("123456789");

        livro1.setAutor(autor);

        livro1.mostardetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setnome("J.k Rowling");
        outroAutor.setEmail("jkrowling@gmail.com");
        outroAutor.setCpf("987654321");

        Livro outroLivro = new Livro();
        outroLivro.setNome("Harry Potter");
        outroLivro.setDescricao("Livro de fantasia");
        outroLivro.setVAlor(500);
        outroLivro.setIsbn("987654321");
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
    }
}