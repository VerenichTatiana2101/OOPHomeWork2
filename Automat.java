import java.util.ArrayList;
import java.util.List;

/*
Данный класс нарушает принцип единственной ответственности.
Класс имеет две обязанности - инициализацию продуктов и создание заказа. 
Лучше разделить их. Если одна обязанность изменится, это не повлияет на другие обязанности.

Принцип открытости / закрытости, принцип подстановки Лискова не нарушается.
Т.к. не использовали наследование или полиморфизм.

Принцип разделения интерфейса не нарушается. Не использовали интерфейсы.

Принцип инверсии зависимости не нарушается.
Абстракции используются для создания заказа.
 */

/**
 * Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Automat {
    protected List<Product> listProduct = new ArrayList<>();

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
     * удалить этот товар из заказа
     */
    public Order<Product> createOrder(List<Product> shoppingList, Automat nearestAutomat, Human buyer) {
        ArrayList<Product> validatedList = new ArrayList<>();
        Product tempProduct;
        double checkList = 0;
        for (Product myProduct : shoppingList) {
            tempProduct = nearestAutomat.getProduct(myProduct.getName());
            if (myProduct.equals(tempProduct) && nearestAutomat.getProduct(myProduct.getName()).getQuantity() > 0) {
                validatedList.add(tempProduct);
                checkList += nearestAutomat.getProduct(myProduct.getName()).getPrice();
                (nearestAutomat.getProduct(myProduct.getName()))
                        .setQuantity((nearestAutomat.getProduct(myProduct.getName())).getQuantity() - 1);
            } else if (myProduct.equals(tempProduct)
                    && nearestAutomat.getProduct(myProduct.getName()).getQuantity() == 0) {
                System.out.println(myProduct.getName() + " - отсутствует в продаже");
            }
        }
        buyer.setTakeOrder(true);
        Order<Product> order = new Order<Product>(validatedList, buyer, nearestAutomat, checkList);
        buyer.setMoney(buyer.getMoney() - checkList);
        return order;
    }

    @Override
    public String toString() {
        String result = " ";
        for (int i = 0; i < listProduct.size(); i++) {
            result += listProduct.get(i);
        }
        return result + "]";
    }
}
