import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class string_i_tablice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        main1();
        main2(input);
        main3(input);
        main4(input);
        main5();
        main6(input);
        main7();
        main8();

        input.close();
    }

    public static void main1() {
        String a = "Java to wspaniały język";
        String b = "wspaniały";
        String c = "najlepszy";

        System.out.println(a);
        a = a.replace(b , c);
        System.out.println(a);
        System.out.println();
    }

    public static void main2(Scanner input) {
        System.out.println("Podaj zdanie");
        String a = input.nextLine().toLowerCase();

        String[] b = a.split(" ");
        
        // Używamy mapy do zliczania wystąpień
        Map<String, Integer> licznik = new LinkedHashMap<>();

        for (String s : b) {
            licznik.put(s, licznik.getOrDefault(s, 0) + 1);
        }

        // Wyświetlamy wyniki
        System.out.println("\nWystąpienia słów:");
        for (String s : licznik.keySet()) {
            System.out.println(s + " - " + licznik.get(s));
        }
        System.out.println();
    }

    public static void main3(Scanner input) {
        StringBuilder a = new StringBuilder();
        String b;
        for (int i = 0; i < 5; i++){
            System.out.println("Podaj wyraz");
            b = input.nextLine();
            a.append(b);
            if( i < 4) a.append(" ");
        }
        System.out.println(a);
        System.out.println();
    }

    public static void main4(Scanner input) {
        System.out.println("Podaj wyraz");
        StringBuilder a = new StringBuilder();
        a.append(input.nextLine());
        
        a.reverse();
        System.out.println(a);

        a.insert(0, "START - ");
        System.out.println(a);

        a.delete(3,6);
        System.out.println(a);

        String b = a.substring(0, 2) + "XYZ" + a.substring(5);
        System.out.println(b);
    }

    public static void main5() {
        long startString = System.nanoTime();
        String text = "";
        for(int i = 0; i < 100000; i++){
            text = text + "X";
        }
        long endString = System.nanoTime();
        long czasString = (endString - startString) / 1_000_000; // na milisekundy

        long startBuilder = System.nanoTime();
        StringBuilder a = new StringBuilder();
        for(int j = 0; j < 100000; j++){
            a.append("X");
        }
        long endBuilder = System.nanoTime();
        long czasBuilder = (endBuilder - startBuilder) / 1_000_000;

        System.out.println("Czas działania dla String: " + czasString + " ms");
        System.out.println("Czas działania dla StringBuilder: " + czasBuilder + " ms");
    }

    public static void main6(Scanner input) {
        System.out.println("Podaj wyraz");
        String a = input.nextLine().toLowerCase();
        
        Map<Character, Integer> licznik = new LinkedHashMap<>();
        for (int i = 0; i < a.length(); i++){
            char znak = a.charAt(i);
            licznik.put(znak, licznik.getOrDefault(znak, 0) + 1);
        }

        System.out.println("Liczba wystąpień:");
        for (char znak : licznik.keySet()){
            System.out.println(znak + " - " + licznik.get(znak));
        }
    }

    public static void main7(){
        Random rand = new Random();
        int[] tab = new int[10];

        for(int i = 0; i < 10; i++){
            tab[i] = rand.nextInt(10);
        }

        for(int j = 0; j < 10; j++){
            System.out.println(tab[j]);
        }
    }

    public static void main8(){
        Random rand = new Random();
        int[] tab = new int[10];

        for(int i = 0; i < 10; i++){
            tab[i] = rand.nextInt(40) - 20;
        }

        for(int j = 0; j < 10; j++){
            System.out.print(tab[j] + "  ");
        }
        System.out.println();

        Arrays.sort(tab);
        for(int j = 0; j < 10; j++){
            System.out.print(tab[j] + "  ");
        }
        System.out.println();

        int srednia = 0;
        for(int j = 0; j < 10; j++){
            srednia = srednia + tab[j];
        }
        srednia = srednia / 10;

        int index = 0, indeks = 9;
        while(tab[index] < srednia) index++;
        while(tab[indeks] > srednia) indeks--;
        indeks = 9 - indeks;

        Map<Integer, Integer> licznik = new HashMap<>();
        for (int liczba : tab){
            licznik.put(liczba, licznik.getOrDefault(liczba, 0) + 1);
        }

        System.out.println("Najmniejsza wartość = " + tab[0] + ", największa wartość =" + tab[9] + ", średnia = " + srednia + ", liczba elementów mniejszych od średniej - " + index + ", liczba elementów większych od średniej - " + indeks);

        System.out.println("Liczba wystąpień:");
        for (int liczba : licznik.keySet()){
            System.out.println(liczba + " - " + licznik.get(liczba));
        }
    }
}
