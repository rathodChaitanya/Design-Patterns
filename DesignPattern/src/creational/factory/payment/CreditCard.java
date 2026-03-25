package creational.factory.payment;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("start credit card ...............");
    }
}
