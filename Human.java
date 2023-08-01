import java.util.ArrayList;

import java.util.List;

public class Human extends Actor {
    private double money;
    private Automat nearestAutomat;

    public Human(String name, boolean isMakeOrder, boolean isTakeOrder, double money) {
        super(name, isMakeOrder, isTakeOrder);
        this.money = money;
    }

    @Override
    public void setMakeOrder(boolean isMade) {

    }

    @Override
    public void setTakeOrder(boolean isTook) {

    }

    @Override
    public boolean getTookOrder() {
        return false;
    }

    @Override
    public boolean getMadeOrder() {
        return false;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setNearestAutomat(Automat list) {
        this.nearestAutomat = list;
    }

    public Automat getAutomat() {
        return nearestAutomat;
    }

    @Override
    public Order makeOrder(List<String> deList, ArrayList<Product> myList, Human buyer) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : deList) {
            shoppingProduct = nearestAutomat.getProduct(nameProduct);
            if (shoppingProduct != null) {
                shoppingList.add(shoppingProduct);
            }
        }
        setMakeOrder(true);
        return nearestAutomat.createOrderList(shoppingList, myList, buyer);
    }

}
