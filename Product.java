import java.util.Calendar;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public abstract class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quantity;
    private Calendar bestBefore;

    public Product(String name, int price, int quantity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "\nProduct [name = " + name + "; price = " + price + "; quantity = " + quantity
                + "; bestBefore = " + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return this.name.equals(other.name)
                && this.price == other.price
                && this.quantity == other.quantity
                && this.bestBefore.equals(other.bestBefore);
    }

    @Override
    public int compareTo(Product o) {
      int resultOfComparing = this.getName().compareTo(o.getName());
      if (resultOfComparing == 0) {
        resultOfComparing = this.getName().compareTo(o.getName());
      }
      return resultOfComparing;
    }
}
