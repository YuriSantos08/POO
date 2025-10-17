//Veiculos Eletricos :
//Crie duas interfaces  : 1- Recarregavel: Metodo abstrato , que recebe parametros tipo int tempo e minutos ; imprima algo como: (recarregando por x minutos) , dentro dela tem que ter uma constante int tempo_maximo = 30
// 2- Autonamo : Metodo abstrato dirigir autonamo parametro  (dirigir autononamente ) constantente boolean : suporteGPS = true
// crie uma classe carro eletrico que implemente ambas as interfaces , adicione um atributo string modelo no construtor nas implementaçoes use o modelo: "o modelo x esta carregando"
// na classe teste veiculo crie um objeto carro eltrico chame os metodos via referencias das interfaces (polimorfismo) e use as constantes
public class Main {
    public static void main(String[] args) {

    CarroEletrico carro = new CarroEletrico("BYD");

    Recarregavel recarregavel = carro;
    recarregavel.recarregar(10 , 20);


    }
}