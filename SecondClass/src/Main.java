public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("J.R.R. Tolkien");
        autor.setEmail("jrrtolkien@gmail.com");
        autor.setCpf("123456789");

        Livro livro1 = new Livro(autor);
        livro1.getNome("O Senhor dos Anéis");
        livro1.setDescricao("Livro de fantasia");
        livro1.setValor(400);
        livro1.setIsbn("123456789");
        livro1.setAutor(autor);

        livro1.mostrarDetalhes();



        Ebook ebook = new Ebook(autor);
        ebook.getNome("Herança em java");
        ebook.setDescricao("Um livro de Programação");
        ebook.setIsbn("74558966");

        ebook.setValor(200);

        ebook.aplicarDescontoDe(10);



    }
}

