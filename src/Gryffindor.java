public class Gryffindor extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство -  " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery;
    }

    public void compareStudentGryffindor(Gryffindor student) {
        if (this.getNobility() + this.getHonor() + this.getBravery() > student.getNobility() + student.getHonor() + student.getBravery()) {
            System.out.println(
                    "Студент факультета Гриффиндор " + this.getName() + " обладет бОльшими показателями, чем студент " + student.getName());
        } else if (this.getNobility() + this.getHonor() + this.getBravery() == student.getNobility() + student.getHonor() + student.getBravery()) {
            System.out.println(
                    "Студент факультета Гриффиндор " + this.getName() + " обладет такими же показателями, как и студент " + student.getName());
        } else {
            System.out.println(
                    "Студент факультета Гриффиндор " + this.getName() + " обладет меньшими показателями, чем студент " + student.getName());
        }
    }
}
