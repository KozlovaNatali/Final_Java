import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
    private PriorityQueue<Toy> queue;

    public ToyStore() {
        queue = new PriorityQueue<>();
    }

    public void put(String toyId, String name, int weight) {
        Toy toy = new Toy(toyId, name, weight);
        queue.offer(toy);
    }

    public Toy get() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        if (randomNumber <= 20) {
            return new Toy("1", "Constructor", 2);
        } else if (randomNumber <= 40) {
            return new Toy("2", "Robot", 2);
        } else {
            return new Toy("3", "Doll", 6);
        }
    }

    public List<Toy> getToys(int num) {
        List<Toy> toys = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Toy toy = get();
            toys.add(toy);
        }
        return toys;
    }

    public void writeToFile(List<Toy> toys, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Toy toy : toys) {
                writer.write(toy.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}