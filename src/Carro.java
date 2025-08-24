public class Carro {

    String nome;
    String marca;
    int ano;
    Motor motor;

    void mostrardetalhes(){
        System.out.println("----Detalhes do Carro:----");
        System.out.println("Nome do carro: "+nome);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
        motor.mostardetalhes();
    }
    void ligarmotor(){
        System.out.println("Motor do carro ligado");
    }
    void desligarMotor(){
        System.out.println("Motor do carro desligado");
    }
}
