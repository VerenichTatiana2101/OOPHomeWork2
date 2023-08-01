import java.util.List;

public class Order {
    private List<Product> list;
    private Human buyer;
    private int check;

    public Order(int check, List<Product> shoppingList, Human buyer) {
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public List<Product> getList() {
        return list;
    }

    public Human getMan() {
        return buyer;
    }

    public void setList(List<Product> shoppingList) {
        this.list = shoppingList;
    }

    public void setMan(Human buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Human:" + buyer + "\nProduct list:\n" + list + "\nCost:" + check;
    }


}


