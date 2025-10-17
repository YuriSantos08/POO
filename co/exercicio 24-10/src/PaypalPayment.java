public class PaypalPayment  implements Paymentmetod{
    @Override
    public void process(Double amount) {
        System.out.println("Processing paypal payment of $" + amount);
    }
}
