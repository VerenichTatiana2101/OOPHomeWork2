import java.util.List;

public class Order {
    private List<Product> productList;
    private Automat nearestAutomat;
    private Human buyer;
    private double price;

    public Order(List<Product> productList, Human buyer, Automat nearestAutomat, double price) {
        this.productList = productList;
        this.buyer = buyer;
        this.nearestAutomat = nearestAutomat;
        this.price = price;
    }

    public Automat getNearestAutomat() {
        return nearestAutomat;
    }

    public void setNearestAutomat(Automat nearestAutomat) {
        this.nearestAutomat = nearestAutomat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Human getHuman() {
        return buyer;
    }

    public void setHuman(Human buyer) {
        this.buyer = buyer;
    }

    public void setList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getList() {
        return productList;
    }

    @Override
    public String toString() {
      String result = "Order [";
      for (int index = 0; index < productList.size(); index++) {
        result += " Product " + (index + 1) + "=" + productList.get(index).getName() + ", ";
      }
      return result + " Name = " + buyer.getName() + ", Total = " + price + "]";
  
    }

}
