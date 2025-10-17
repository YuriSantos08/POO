public class EmailService  implements SMTPEmailService{

    @Override
    public  void sendConfirmationEmail (String type , double amount ) {
        System.out.println("Email  sent confirming " + type + " payment of $ " + amount);
    }
}
