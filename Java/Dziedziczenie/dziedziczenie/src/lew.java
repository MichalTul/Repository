public class lew extends Animal {

    public lew(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Wydaję dźwięk: Roooar!");
    }

    @Override
    public void eat() {
        System.out.println("Jem mięso.");
    }
}
