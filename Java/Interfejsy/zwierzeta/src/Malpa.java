public class Malpa implements Animal {
    private String name;
    private int age;

    public Malpa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Nazywam się " + name + ", mam " + age + " lat(a).");
    }

    @Override
    public void voice() {
        System.out.println("Uuu-a-a!");
    }

    @Override
    public void eat() {
        System.out.println("Jem banany i owoce.");
    }
}
