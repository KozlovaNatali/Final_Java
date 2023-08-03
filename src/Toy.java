import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

class Toy implements Comparable&lt;Toy&gt; {
    private String toyId;
    private String name;
    private int weight;

    public Toy(String toyId, String name, int weight) {
        this.toyId = toyId;
        this.name = name;
        this.weight = weight;
    }

    public String getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "ID: " + toyId + ", Name: " + name + ", Weight: " + weight;
    }
}