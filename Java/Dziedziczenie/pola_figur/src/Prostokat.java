public class Prostokat extends Figura {
    private double a, b;

    public Prostokat(double a, double b) {
        super("Prostokąt");
        this.a = a;
        this.b = b;
    }

    @Override
    public void obliczPole() {
        pole = a * b;
    }

    @Override
    public void obliczObwod() {
        obwod = 2 * (a + b);
    }
}
