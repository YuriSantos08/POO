public class Livrofisico extends  Livro{

    private double valordaimpressao;

    public Livrofisico(Autor autor) {
        super(autor);
    }



    @Override
    void mostrarDetalhes() {
        String mensagem = "Detalhes do livro Físico: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Valor da Impressão: " + this.getValordaimpressao());
        System.out.println("------------");

        if(temAutor()){
            this.getAutor().mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }

    public double getValordaimpressao() {
        return this.getValor() * 5 / 100;
    }

    public void setValordaimpressao(double valordaimpressao) {
        this.valordaimpressao = valordaimpressao;
    }
    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 10){
            System.out.println("O desconto não pode ser maior que 10%");
            return false;
        }
        return super.aplicarDescontoDe(porcentagem);
    }

}
