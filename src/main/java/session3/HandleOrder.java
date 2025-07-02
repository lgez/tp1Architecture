package session3;


public abstract class HandleOrder {
    public void dispatch(){
        DeliveryMethode deliveryMethode = createMethode();
        deliveryMethode.expedition();

    }

    public abstract DeliveryMethode createMethode();
}
