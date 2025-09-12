public class CarrinhoDeCompraa {

    private double valortotal;

    public void adicionarLivro (Livro livro){

        System.out.println("Livro adicionado ao carrinho: " + livro);
       livro.aplicarDescontoDe(5);
        valortotal += livro.getValor();
    }

    public double getValortotal() {
        return valortotal;
    }
}
