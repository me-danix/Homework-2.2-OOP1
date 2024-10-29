public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 67, 74, 52, 20, 27);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 71, 99, 90, 99, 54);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 63, 36, 31, 59, 29);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 80, 65, 29, 97, 56);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 73, 91, 75, 44, 63);
        Hufflepuff justinFletchley = new Hufflepuff("Джастин Финч-Флетчли", 27, 67, 38, 84, 35);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 52, 100, 63, 42, 39, 20);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 46, 20, 40, 50, 50, 85);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 80, 44, 97, 52, 61, 77);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 49, 90, 79, 43, 69, 21, 99);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 34, 25, 70, 77, 31, 59, 63);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 44, 90, 89, 96, 52, 36, 55);

        System.out.println("ronWeasley = " + ronWeasley);
        System.out.println("justinFletchley = " + justinFletchley);
        System.out.println("marcusBelby = " + marcusBelby);
        System.out.println("gregoryGoyle = " + gregoryGoyle);

        System.out.println();

        harryPotter.compareStudent(dracoMalfoy);
        zachariahSmith.compareStudentHufflepuff(cedricDiggory);
    }
}