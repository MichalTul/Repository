public class Trojkat extends Figura {
    private double a, b, c; //zakładam, że podstawą jest a
    private double h;

    public Trojkat(double a, double b, double c, double h) {
        super("Trójkąt");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void obliczPole() {
        pole = 0.5 * a * h;
    }

    @Override
    public void obliczObwod() {
        obwod = a + b + c;
    }
}
