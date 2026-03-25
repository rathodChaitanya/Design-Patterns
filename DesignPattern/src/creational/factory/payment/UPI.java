package creational.factory.payment;

public class UPI implements Payment{

    @Override
    public void pay() {
        System.out.println("start UPI ...............");
    }
}
