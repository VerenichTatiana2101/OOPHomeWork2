import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Automat {
    private ArrayList<Product> listProduct = new ArrayList<>();

    public void initProducts(ArrayList<Product> myList) {
        this.listProduct = myList;
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
     * @param shoppingList
     * @param nearestAutomat
     * @param buyer
     * @return
     */
    public Order createOrderList(List<Product> shoppingList, Automat nearestAutomat, Human buyer) {
        int checkList = 0;
        Product temProduct;
        List<Product> validatedProducts = new ArrayList<>();
        for (Product myProduct : shoppingList) {
            temProduct = nearestAutomat.getProduct(myProduct.getName());
            if (myProduct.equals(temProduct) && nearestAutomat.getProduct(myProduct.getName()).getQuantity() > 0) {
                validatedProducts.add(temProduct);
                checkList += nearestAutomat.getProduct(myProduct.getName()).getPrice();
                (nearestAutomat.getProduct(myProduct.getName()))
                        .setQuantity(nearestAutomat.getProduct(myProduct.getName()).getQuantity() - 1);
            } else if (myProduct.equals(temProduct)
                    && nearestAutomat.getProduct(myProduct.getName()).getQuantity() == 0) {
                System.out.println(myProduct.getName() + "отсутствует");
            }
        }
        buyer.setTakeOrder(true);
        Order order = new Order(checkList, validatedProducts, nearestAutomat, buyer);

        return order;
    }

}

