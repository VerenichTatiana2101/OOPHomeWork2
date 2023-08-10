import java.util.Calendar;
/*
 * В данном классе нарушений не вижу, класс имеет только одну обязанность создания горячих напитков,
 * Полиморфизм или наследование не использовалось, интерфейсы тоже. Абстракции используются
 * для создания горячих напитков.
 */
public class HotDrinks extends Beverages {
    private Integer temperature;

    public HotDrinks(String name, int price, int quantity, Calendar bestBefore, double volume, Integer temperature){
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
        return super.toString() + ", t°: " + String.valueOf(temperature) + "]";
    }   
}
