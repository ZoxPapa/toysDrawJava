import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1.weight > o2.weight) {
            return -1;
        } else if (o2.weight > o1.weight) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
