public abstract class Figura {
    private String nazwa;
    protected double pole;
    protected double obwod;

    public Figura(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract void obliczPole();
    public abstract void obliczObwod();

    public void wyswietlInfo() {
        System.out.println("Figura: " + nazwa);
        System.out.println("Pole: " + pole);
        System.out.println("Obwód: " + obwod);
        System.out.println();
    }
}
