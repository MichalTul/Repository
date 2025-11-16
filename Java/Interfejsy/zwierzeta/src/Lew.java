public class Lew implements Animal {
    private String name;
    private int age;

    public Lew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Nazywam się " + name + ", mam " + age + " lat(a).");
    }

    @Override
    public void voice() {
        System.out.println("Roooar!");
    }

    @Override
    public void eat() {
        System.out.println("Jem mięso.");
    }
}
