public class malpa extends Animal {

    public malpa(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Wydaję dźwięk: Uuu-a-a!");
    }

    @Override
    public void eat() {
        System.out.println("Jem banany i owoce.");
    }
}
