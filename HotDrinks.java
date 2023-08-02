import java.util.Calendar;

public class HotDrinks extends Beverages {
    private int temperature;

    public HotDrinks(String name, int price, int quantity, Calendar bestBefore, double volume, int temperature){
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + String.valueOf(temperature) + "]";
    }

    
}
