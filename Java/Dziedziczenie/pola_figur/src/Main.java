public class Main {
    public static void main(String[] args) {

        Figura[] figury = {
            new Kolo(5),
            new Prostokat(4, 7),
            new Trojkat(3, 4, 5, 2.5)
        };

        for (Figura f : figury) {
            f.obliczPole();
            f.obliczObwod();
            f.wyswietlInfo();
        }
    }
}
