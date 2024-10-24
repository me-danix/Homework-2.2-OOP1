public class Hufflepuff extends HogwartsStudent {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие -  " + industriousness +
                ", верность - " + loyalty +
                ", честность - " + honesty;
    }

    public void compareStudentHufflepuff(Hufflepuff student) {
        if (this.getIndustriousness() + this.getLoyalty() + this.getHonesty() > student.getIndustriousness() + student.getLoyalty() + getHonesty()) {
            System.out.println(
                    "Студент факультета Пуффендуй " + this.getName() + " обладет бОльшими показателями, чем студент " + student.getName());
        } else if (this.getIndustriousness() + this.getLoyalty() + this.getHonesty() == student.getIndustriousness() + student.getLoyalty() + getHonesty()) {
            System.out.println(
                    "Студент факультета Пуффендуй " + this.getName() + " обладет такими же показателями, как и студент " + student.getName());
        } else {
            System.out.println(
                    "Студент факультета Пуффендуй " + this.getName() + " обладет меньшими показателями, чем студент " + student.getName());
        }
    }
}
