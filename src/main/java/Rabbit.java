public class Rabbit extends Animal {
    private String name;
    private int age;
    private String branch;

    public Rabbit(String branch) {
        this.name = "Myo";
        this.branch = branch;
    }

    public void play() {
        System.out.println(name + ": Time to graze the grass.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit " + name + " plays with " + toy);
    }
}
