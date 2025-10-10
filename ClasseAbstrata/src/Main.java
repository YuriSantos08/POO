import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // Erro de compilação
    //FormaGeometrica forma = new FormaGeometrica("Azul");

        //Circulo circulo = new Circulo("Azul" , 5);
       // Retangulo retangulo = new Retangulo("Verde" , 4.0 , 5.0);

        //circulo.exibirDetalhes();
       // retangulo.exibirDetalhes();

        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo("Azul" , 3));
        formas.add(new Circulo("Vermelho" , 4));
        formas.add(new Retangulo("Amarelo" , 4 , 5));
        formas.add(new Retangulo("Verde" , 4 , 5 ));


        for (FormaGeometrica forma : formas) {
            forma.exibirDetalhes();
        }


        }
    }
