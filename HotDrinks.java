import java.util.Calendar;

public class HotDrinks extends Beverages {
    private double temperature;
    public HotDrinks(String name, int price, int quantity, Calendar bestBefore, int volume, double temperature){
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + String.valueOf(temperature) + "]";
    }

    
}
