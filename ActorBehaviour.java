import java.util.List;

public interface ActorBehaviour {
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTook);
    boolean getTookOrder();
    boolean getMadeOrder();
    Order<Product> makeOrder(List<String> deList, Automat nearesAutomat, Human buyer);
}
