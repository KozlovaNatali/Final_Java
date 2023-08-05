class Toy implements Comparable <Toy> {
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