public class Slon implements Animal {
    private String name;
    private int age;

    public Slon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Nazywam się " + name + ", mam " + age + " lat(a).");
    }

    @Override
    public void voice() {
        System.out.println("Truuuum!");
    }

    @Override
    public void eat() {
        System.out.println("Jem rośliny.");
    }
}
