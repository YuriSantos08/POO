public class Ebook extends Livro {
    private String watermark;

    public Ebook(Autor autor) {
        super(); // Chama o construtor padrão de Livro
        this.setAutor(autor); // Usa o setter herdado para definir o autor
    }

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 15) {
            System.out.println("Não é possível dar desconto maior que 15%");
            return false;
        }
        return super.aplicarDesconto(porcentagem);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do Ebook:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: R$" + this.getValor());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Watermark: " + this.getWatermark());

        if (temAutor()) {
            this.getAutor().mostrarDetalhes();
        }
    }
}
