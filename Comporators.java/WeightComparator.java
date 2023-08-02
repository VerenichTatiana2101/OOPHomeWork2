import java.util.Comparator;

public class WeightComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        if (o1.getWeight()>o2.getWeight()) {
            return 1;
        }
        else {
            if (o1.getWeight()<o2.getWeight()) return -1;
        }
        return 0;
    }

}
