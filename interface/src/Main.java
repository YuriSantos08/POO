public class Main {
    public static void main(String[] args) {

        Passaro passaro = new Passaro("Papagaio");
        passaro.voar();

        System.out.println("<<<<<<===============>>>>>>>>>>");
        //polimorfismo
        Voavel voador = passaro;
        voador.voar();

        Pato pato = new Pato("Pituco");
        pato.nadar();
        pato.voar();

    }
}