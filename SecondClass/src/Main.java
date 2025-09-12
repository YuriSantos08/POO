public class Main {
    public static void main(String[] args) {


        //aula2

        Autor autor = new Autor();
        autor.setNomeAutor("J.R.R Tolkien");
        autor.setEmailAutor("jrrtolkien@gmail.com");
        autor.setCPFAutor("123.456.789-00");

        Autor autor2 = new Autor();
        autor2.setNomeAutor("J.K Rowling");
        autor2.setEmailAutor("jkrowling@gmail.com");
        autor2.setCPFAutor("123.456.799-00");

        //aula3

        Ebook ebook1 = new Ebook(autor);
        ebook1.setNome("Herança em Java");
        ebook1.setWaterMark("watermark");
        ebook1.setDescricao("Teste de herança");
        ebook1.setValor(50);
        ebook1.setIsbn("468-487-963-1");



        System.out.println("Valor do Ebook: " + ebook1.getValor());




        // aula
        Livrofisico livrofisico = new Livrofisico(autor);
        livrofisico.setNome("Herança Java");
        livrofisico.setValor(400);


        CarrinhoDeCompraa carrinhoDeCompraa = new CarrinhoDeCompraa();
        carrinhoDeCompraa.adicionarLivro(livrofisico);
        carrinhoDeCompraa.adicionarLivro(ebook1);
        System.out.println("Valor total: " + carrinhoDeCompraa.getValortotal());

//        livro1.aplicarDescontoDe(20);
//        livro2.aplicarDescontoDe(15);

//        System.out.println("O livro agora custa: " + livro1.getValor());
//        System.out.println("O livro agora custa: " + livro2.getValor());
//        System.out.println(livro1.temAutor());
//        System.out.println(livro2.temAutor());



        //aula1

        /*//criando autor
        Autor autor = new Autor();
        autor.nomeAutor = "J.R.R Tolkien";
        autor.emailAutor = "jrrtolkien@gmail.com";
        autor.CPFAutor = "123.456.789-00";
        //criando livro
        Livro livro = new Livro();
        livro.nome = "O Senhor dos Anéis.";
        livro.descricao = "Uma história de fantasia medieval.";
        livro.valor = 200.0;
        livro.isbn = "123-456-78-9";
        //puxando o autor pro livro
        livro.autor = autor;
        //printa as informacoes do livro 1
        System.out.println("Livro 1: ");
        livro.mostrarDetalhes();


        //criando outro autor
        Autor outroAutor = new Autor();
        outroAutor.nomeAutor = "Antoine de Saint-Exupéry";
        outroAutor.emailAutor = "slkmuitodificil@gmail.com";
        outroAutor.CPFAutor = "123.456.789-22";

        //criando outro livro
        Livro outroLivro = new Livro();
        outroLivro.nome = "O Pequeno Príncipe.";
        outroLivro.descricao = "Uma história de criatividade infantil.";
        outroLivro.valor = 120.0;
        outroLivro.isbn = "123-456-56-9";
        //puxando o autor pro livro 2
        outroLivro.autor = outroAutor;

        //mostra as informacoes do livro 2
        System.out.println("Livro 2: ");
        outroLivro.mostrarDetalhes();*/

    }
}

