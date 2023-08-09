import java.io.Serializable;

public class Toy implements Comparable<Toy>, Serializable {
    Integer toyId;
    String name;
    Integer weight;

    public Toy(Integer toyId, String name, Integer weight) {
        this.toyId = toyId;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ID: " + toyId + ", Name: " + name;
    }

    @Override
    public int compareTo(Toy o) {
        int result = new ToyComparator().compare(this, o);
        if (result != 0) {
            return result;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
