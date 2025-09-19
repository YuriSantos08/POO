
public class Main {
    public static void main(String[] args) {


        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.ano = 2021;
        carro.nome = "Argo";

        Motor motor = new Motor();
        motor.combustivel = "Gasolina";
        motor.potencia = 98;

        carro.motor = motor;

        carro.mostrardetalhes();
        carro.ligarmotor();
        carro.desligarMotor();

    }
}