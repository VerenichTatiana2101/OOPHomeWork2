import java.util.List;

public class Order {
    private List<Product> shoppingList;
    private Human buyer;
    private double check;

    public Order(double check, List<Product> shoppingList, Human buyer) {
    }

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    public List<Product> getList() {
        return shoppingList;
    }

    public Human getHuman() {
        return buyer;
    }

    public void setHuman(Human buyer) {
        this.buyer = buyer;
    }

    public void setList(List<Product> shoppingList) {
        this.shoppingList = shoppingList;
    }


    @Override
    public String toString() {
        return "Human:" + buyer + "\nProduct list:\n" + shoppingList + "\nCost:" + check;
    }


}


