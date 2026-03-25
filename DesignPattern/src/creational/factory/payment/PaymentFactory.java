package creational.factory.payment;

public class PaymentFactory {

    public static Payment createPayment(String type) {
        if(type.equalsIgnoreCase("UPI")){
            return new UPI();
        }

        if(type.equalsIgnoreCase("CC")){
            return new CreditCard();
        }

        throw new IllegalArgumentException("Invalid type");
    }



}
