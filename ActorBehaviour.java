import java.util.List;
/*
Интерфейс не нарушает принцип единственной ответственности
В данном случае интерфейс имеет только одну обязанность - создание заказа.

Принцип открытости / закрытости, подстановки Лискова не нарушается. 
Не использовали наследование или полиморфизм.

Принцип разделения интерфейса не нарушается. 
Используются только те методы, которые нужны для создания заказа.

Принцип инверсии зависимости не нарушается. 
Используются абстракции для создания заказа.
 */
public interface ActorBehaviour {
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTook);
    boolean getTookOrder();
    boolean getMadeOrder();
    Order<Product> makeOrder(List<String> deList, Automat nearesAutomat, Human buyer);
}
