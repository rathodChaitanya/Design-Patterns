package creational.factory.payment;

public class Test {
    public static void main(String[] args) {
        Payment pay = PaymentFactory.createPayment("UPI");
        pay.pay();
        pay = PaymentFactory.createPayment("CC");
        pay.pay();

    }
}
