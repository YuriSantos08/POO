public class PaymentProcessor {
    private  Paymentmetod paymentmetod;
    private  EmailService emailService;

    public  PaymentProcessor (Paymentmetod paymentmetod , EmailService emailService) {
        this.paymentmetod = paymentmetod;
        this.emailService = emailService;
    }

    public void process(String type , double amount) {}
}
