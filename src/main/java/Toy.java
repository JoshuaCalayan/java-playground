public class Toy implements Action {
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("The " + brand + " brand toy is played with");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Robot " + brand + " is happy to see " + toy);
    }
}
