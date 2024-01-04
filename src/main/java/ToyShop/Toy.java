package ToyShop;

public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int weight;


    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "id: " + this.id + " name: " + this.name + "\n";
    }

    public int compareTo(Toy o) {
        return o.getWeight() - this.getWeight();
    }
}