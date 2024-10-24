public class Ravenclaw extends HogwartsStudent {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", разум -  " + mind +
                ", мудрость - " + wisdom +
                ", остроумие - " + wit +
                ", креативность - " + creativity;
    }

    public void compareStudentRavenclaw(Ravenclaw student) {
        if (this.getMind() + this.getWisdom() + this.getWit() + this.getCreativity() > student.getMind() + student.getWisdom() + getWit() + getCreativity()) {
            System.out.println(
                    "Студент факультета Когтевран " + this.getName() + " обладет бОльшими показателями, чем студент " + student.getName());
        } else if (this.getMind() + this.getWisdom() + this.getWit() + this.getCreativity() == student.getMind() + student.getWisdom() + getWit() + getCreativity()) {
            System.out.println(
                    "Студент факультета Когтевран " + this.getName() + " обладет такими же показателями, как и студент " + student.getName());
        } else {
            System.out.println(
                    "Студент факультета Когтевран " + this.getName() + " обладет меньшими показателями, чем студент " + student.getName());
        }
    }
}
