import java.util.List;

public class main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.put("1", "Constructor", 2);
        toyStore.put("2", "Robot", 2);
        toyStore.put("3", "Doll", 6);

        List <Toy> toys = toyStore.getToys(10);
        toyStore.writeToFile(toys, "results.txt");
    }
}
