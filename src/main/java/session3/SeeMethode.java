package session3;

public class SeeMethode extends HandleOrder{
    @Override
    public DeliveryMethode createMethode() {
        return new Boat();

    }
}
