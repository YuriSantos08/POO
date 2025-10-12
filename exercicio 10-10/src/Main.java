import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Pluto"));
        animais.add(new Cachorro("Rio"));
        animais.add(new Gato("Garfield"));
        animais.add(new Gato("Tom"));

        for (Animal animal : animais) {
            animal.exibirDetalhes();
        }
    }
}