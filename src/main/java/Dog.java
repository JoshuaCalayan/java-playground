public class Dog extends Animal {

    private String name;
    private int age;
    private String owner;

    Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void play() {
        System.out.println("Dog " + name + " is chasing their tail.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Dog " + name + " plays with " + toy);
    }
}
