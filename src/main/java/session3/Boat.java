package session3;

public class Boat implements DeliveryMethode{
    @Override
    public void expedition() {
        System.out.println("We've shipped your order.");
        estimatedTime();
    }

    @Override
    public void estimatedTime() {

        System.out.println("The boat method will take 4 days to arrive.");
    }
}
