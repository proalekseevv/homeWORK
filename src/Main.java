import   java.util.Random;


public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindor ("Гарри Поттер");
        Gryffindor ron = generateGryffindor ("Рон Уизли");
        Ravenclaw luna = generateRavenclaw("Полумна Лавгуд");
        Slytherin draco = generateSlytherin ( "Драко Малфой");
        Hufflepuff cedric = generateHufflepuff ( "Седрик Диггори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();

        harry.compareHogwarts(draco);
        harry.compareHogwarts(ron);
        harry.compareGryffindor(ron);

    }

    private static Gryffindor generateGryffindor (String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }

    private static Hufflepuff generateHufflepuff  (String name) {
        return new Hufflepuff (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }




    private static Slytherin generateSlytherin (String name) {
        return new Slytherin (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }

    private static Ravenclaw generateRavenclaw (String name) {
        return new Ravenclaw (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }


}