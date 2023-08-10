import java.util.Calendar;
/*
 * В данном классе нарушений не вижу, класс имеет только одну обязанность создания продуктов(еды),
 * Полиморфизм или наследование не использовалось, интерфейсы тоже. Абстракции используются
 * для создания продуктов(еды).
 */
public class Food extends Product {
    private double weight;
    public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
        super(name, price, quantity, bestBefore);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weight: " + String.valueOf(weight) + "]";
    }

}
