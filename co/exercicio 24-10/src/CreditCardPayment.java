public class CreditCardPayment implements Paymentmetod {


    @Override
    public void process(Double amount) {
        System.out.println("Processing credit card payment of $" + amount
        );
    }
}
