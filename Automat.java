import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Automat {
    private List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        this.listProduct = myList;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Добавить проверку в Order (validateOrder()) до оформления заказа:
     * если заказано некоторого товара больше, чем есть в автомате,
     * удалить этот товар из заказа (желательно в одну проходку)
     * 
     * @param shoppingList
     * @param nearestAutomat
     * @param buyer
     * @return
     */
    public Order createOrderList(List<Product> shoppingList, Human buyer) {
        int checkList = 0;
        for (Product myProduct : shoppingList) {
            if (getProduct(myProduct.getName()).getQuantity() > 0
                    && myProduct.getQuantity() <= getProduct(myProduct.getName()).getQuantity()) {
                checkList += getProduct(myProduct.getName()).getPrice() * myProduct.getQuantity();
            } else {
                shoppingList.remove(myProduct);
            }
        }
        buyer.setTakeOrder(true);
        Order order = new Order(checkList, shoppingList, buyer);

        return order;
    }

    @Override
    public String toString() {
      String result = "Automat [\n";
      for (int i = 0; i < listProduct.size(); i++) {
        result += listProduct.get(i) + "\n";
  
      }
      return result + "]";
    }
  
  }
