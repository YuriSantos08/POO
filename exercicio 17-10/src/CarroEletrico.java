public  class CarroEletrico implements  Autonamo , Recarregavel{

    String modelo;

    public CarroEletrico ( String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void dirigirAutonomamente(String dirigir) {
        System.out.println(modelo + " está dirigindo autonomamente: " + dirigir);
    }

    @Override
    public void recarregar(int tempo, int minutos) {
        System.out.println(modelo + " está recarregando por " + TEMPO_MAXIMO + " minutos.");

    }
}
