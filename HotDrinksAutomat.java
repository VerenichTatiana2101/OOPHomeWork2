import java.util.ArrayList;
import java.util.List;

public class HotDrinksAutomat extends Automat {
    private List<HotDrinks> listHotDrinks = new ArrayList<>();

    public void initHotDrinks(List<HotDrinks> myList2) {
        this.listHotDrinks = myList2;
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


}
