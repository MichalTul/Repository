public class Kolo extends Figura {
    private double r;

    public Kolo(double r) {
        super("Koło");
        this.r = r;
    }

    @Override
    public void obliczPole() {
        pole = Math.PI * r * r;
    }

    @Override
    public void obliczObwod() {
        obwod = 2 * Math.PI * r;
    }
}
