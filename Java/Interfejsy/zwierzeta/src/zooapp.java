public class zooapp {
    public static void main(String[] args) {
        Animal[] zoo = {
            new Lew("Lew", 5),
            new Slon("Słoń", 12),
            new Malpa("Małpa", 3)
        };

        for (Animal a : zoo) {
            a.introduceYourself();
            a.voice();
            a.eat();
            System.out.println();
        }
    }
}