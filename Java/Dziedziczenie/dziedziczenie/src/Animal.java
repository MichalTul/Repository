public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("Nazywam się " + name + ", mam " + age + " lat(a).");
    }

    public void voice() {
        System.out.println("Wydaję dźwięk: głos");
    }

    public void eat() {
        System.out.println("Jem zwykłe jedzenie.");
    }
}