import java.util.List;
/*
 * В данном классе четыре переменные: productList отвечает за список продуктов в заказе, 
 * nearestAutomat отвечает за ближайший автомат к заказу, buyer отвечает за покупателя, 
 * price отвечает за цену заказа. Класс отвечает только за создание заказа.
 */

/*
 * Класс Ордер сделайте типизированным, добавьте возможность создавать заказ с продуктами: 
 * 2.1 однотипными 2.2(*) разного типа Внесите соответственно изменения в остальной код, 
 * где используются объекты заказа
 */
public class Order<T extends Product> {
    private List<T> productList;
    private Automat nearestAutomat;
    private Human buyer;
    private double price;

    public Order(List<T> productList, Human buyer, Automat nearestAutomat, double price) {
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

    public void setList(List<T> productList) {
        this.productList = productList;
    }

    public List<T> getList() {
        return productList;
    }

    @Override
    public String toString() {
      String result = "Shopper bag: [";
      for (int index = 0; index < productList.size(); index++) {
        result += " Product " + (index + 1) + "=" + productList.get(index).getName() + ", ";
      }
      return result + " Name = " + buyer.getName() + ", Total = " + price + "]";
    }
}
