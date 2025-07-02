package session3;

public class Truck implements DeliveryMethode{
    @Override
    public void expedition() {
        System.out.println("We've shipped your order.");
        estimatedTime();
    }

    @Override
    public void estimatedTime() {

        System.out.println("The truck method will take 8 days to arrive.");
    }
}
