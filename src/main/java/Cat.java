public class Cat extends Animal {


    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("Cat " + name + " jumps on the table.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Cat " + name + " plays with " + toy);
    }

}
