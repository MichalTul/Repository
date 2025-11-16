public class zooapp {
    public static void main(String[] args) {

        Animal[] zoo = {
            new lew("Lew", 5),
            new slon("Słoń", 12),
            new malpa("Małpa", 3)
        };

        for (Animal a : zoo) {
            a.introduceYourself();
            a.voice();
            a.eat();
            System.out.println();
        }
    }
}