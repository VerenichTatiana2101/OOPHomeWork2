import java.util.Comparator;

public class WeightComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }

}
