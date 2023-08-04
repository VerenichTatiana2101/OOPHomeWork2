import java.util.List;

public class HotDrinksAutomat extends Automat {

    public HotDrinksAutomat() {
        super();
      }
    
      @Override
      public void initProducts(List<Product> myList) {
        super.initProducts(myList);
      }
    
      public HotDrinks getProduct(String name, Double volume, Integer temperature) {
        for (Product hotDrink : listProduct) {
          if (hotDrink instanceof Product & hotDrink.getName().equals(name) & ((HotDrinks) hotDrink).getTemperature() == temperature
              & ((HotDrinks) hotDrink).getVolume() == volume) {
            return (HotDrinks) hotDrink;
          }
        }
        return null;
    
      }

    // public String getProduct(String name, double volume, double temperature) {
    //     for (HotDrinks hotDrink : listHotDrinks) {
    //         if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume
    //                 && hotDrink.getTemperature() == temperature) {
    //             return "Name: " + hotDrink.getName() + ", Volume: " + hotDrink.getVolume() + ", t°: "
    //                     + hotDrink.getTemperature();
    //         }
    //     }
    //     return null;
    // }

    public HotDrinks getDrinksName(String name) {
        for (Product hotDrink : listProduct) {
            if (hotDrink instanceof Product & hotDrink.getName().equals(name)) {
                return (HotDrinks) hotDrink;
            }
        }
        return null;

    }

}
