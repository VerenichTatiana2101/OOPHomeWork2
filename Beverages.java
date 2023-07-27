import java.util.Calendar;

public class Beverages extends Product {
    private double volume;
    public Beverages(String name, int price, int quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Volume: " + String.valueOf(volume) + "]";
    }
}

