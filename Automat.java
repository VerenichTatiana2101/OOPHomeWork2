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

    // public Order createOrderList(List<Product> shoppingList, Human buyer) {
    //     int checkList = 0;
    //     for (Product myProduct : shoppingList) {
    //         if (getProduct(myProduct.getName()).getQuantity() > 0) {
    //             checkList += getProduct(myProduct.getName()).getPrice();
    //         } else {
    //             shoppingList.remove(myProduct);
    //         }
    //     }
    //     Order order = new Order();
    //     order.setCheck(checkList);
    //     order.setMan(buyer);
    //     order.setList(shoppingList);

    //     return order;
    // }

    public Order createOrderList(List<Product> shoppingList, ArrayList<Product> myList, Human buyer) {
        int checkList = 0;
        List<Product> availableProducts = new ArrayList<>();
        for (Product myProduct : shoppingList) {
            for (Product product : myList) {
                if (myProduct.getName().equals(product.getName()) 
                && myProduct.getQuantity() <= product.getQuantity()) {
                    availableProducts.add(myProduct);
        }
        Order order = new Order();
        order.setCheck(checkList);
        order.setMan(buyer);
        order.setList(availableProducts);

        return order;
    }
}
    }
}
    
