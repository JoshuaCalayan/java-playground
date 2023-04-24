public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        coco.setName("coco II");

        Dog max = new Dog("max", 5, "Steve");

        Rabbit myo = new Rabbit("Section E");

        Toy aToy = new Toy("Generic Toy Brand");


        Action[] homeFrens = new Action[4];
        homeFrens[0] = coco;
        homeFrens[1] = max;
        homeFrens[2] = myo;
        homeFrens[3] = aToy;

        for(Action frens : homeFrens) {
            frens.play(aToy);
        }

        aToy.play();

    }
}
