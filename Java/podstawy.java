import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        main1(args);
        main2(args);
        main3(args);
        main4(input);
        main5(args);
        main6(input);

        input.close();
    }

    public static void main1(String[] args) {
        System.out.println("Witaj, jestem Michał");
    }

    public static void main2(String[] args) {
        int wiek = 30;
        double wzrost = 173.0;
        double waga = 71.9;
        System.out.println("Wiek = " + wiek + ", wzrost = " + wzrost + ", waga = " + waga);
    }

    public static void main3(String[] args) {
        int y = 10;
        for (int i = 1; i < y; i++){
            for (int j = 1; j < y; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main4(Scanner input) {
        System.out.println("Podaj cyfrę od 1 do 7");
        int day = input.nextInt();
        switch (day) {
            case 1: System.out.println("Poniedziałek"); break;
            case 2: System.out.println("Wtorek"); break;
            case 3: System.out.println("Środa"); break;
            case 4: System.out.println("Czwartek"); break;
            case 5: System.out.println("Piątek"); break;
            case 6: System.out.println("Sobota"); break;
            case 7: System.out.println("Niedziela"); break;
            default: System.out.println("Miały być cyfry od 1 do 7");
        }
    }

    public static void main5(String[] args) {
        int a = 100;
        int b = 1;
        int c = 0;
        while (b < a){
            c = c + b;
            b++;
        }
        System.out.println(c);
    }

    public static void main6(Scanner input) {
        System.out.println("Podaj n ");
        int n = input.nextInt();
        for (int i = 1; i < n + 1; i++){
            System.out.print(i);
            if (i % 2 == 0) System.out.print(", parzysta");
            else System.out.print(", nieparzysta");
            if (i % 3 == 0) System.out.print(", FIZZ");
            if (i % 5 == 0) System.out.print(", BUZZ");
            System.out.println();
        }
        System.out.println();
    }
}