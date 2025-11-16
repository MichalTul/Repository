public class slon extends Animal {

    public slon(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Wydaję dźwięk: Truuuum!");
    }

    @Override
    public void eat() {
        System.out.println("Jem rośliny.");
    }
}
