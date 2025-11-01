 class  DividirPorZeroException extends Exception {
    public  DividirPorZeroException(String msg) {
        super(msg);
    }
 }

 class Calculadora {

     public void dividir(int a , int b) throws  DividirPorZeroException{
        if(b == 0) {
            throw new DividirPorZeroException("NAO e possivel dividir por zero");
        }
        int c = a/b;
    }
 }


public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        try {
            calculadora.dividir(10 , 0);
        }catch (DividirPorZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }










//        try{
//        //tenta executar   , checagem
//            int a = 10;
//            int b = 0;
//            int c = a/b;
//        }catch (ArithmeticException e) {
//            System.out.println("Voce sabia que nao se pode dividir por zero? gerou o erro: " + e.getMessage());
//        }
    }
}