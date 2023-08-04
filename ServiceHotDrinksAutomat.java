import java.util.List;

public class ServiceHotDrinksAutomat implements Service<HotDrinksAutomat, HotDrinks> {

  @Override
  public HotDrinksAutomat restock(HotDrinksAutomat automat, HotDrinks product) {
    Product addProduct = automat.getDrinksName(product.getName());
    List<Product> myList2 = automat.getListProduct();
    if (addProduct != null) {
      addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
    } else {
      myList2.add(product);
    }
    automat.initProducts(myList2);
    return automat;

  }

}
