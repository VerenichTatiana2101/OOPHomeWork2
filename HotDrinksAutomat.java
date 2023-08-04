import java.util.ArrayList;
import java.util.List;

public class HotDrinksAutomat extends Automat {
    private List<HotDrinks> listHotDrinks = new ArrayList<>();

    @Override
    public void initProducts(List<Product> myList) {
        super.initProducts(myList);
    }

    public String getProduct(String name, double volume, double temperature) {
        for (HotDrinks hotDrink : listHotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume
                    && hotDrink.getTemperature() == temperature) {
                return "Name: " + hotDrink.getName() + ", Volume: " + hotDrink.getVolume() + ", t°: "
                        + hotDrink.getTemperature();
            }
        }
        return null;
    }

    public HotDrinks getDrinksName(String name) {
        for (Product hotDrink : listHotDrinks) {
            if (hotDrink instanceof Product & hotDrink.getName().equals(name)) {
                return (HotDrinks) hotDrink;
            }
        }
        return null;

    }

}
