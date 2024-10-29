public class Slytherin extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int authority;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость -  " + cunning +
                ", решительномть - " + determination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + authority;
    }

    public void compareStudentSlytherin(Slytherin student) {
        if (this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getAuthority() > student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getAuthority()) {
            System.out.println(
                    "Студент факультета Слизерин " + this.getName() + " обладет бОльшими показателями, чем студент " + student.getName());
        } else if (this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getAuthority() == student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getAuthority()) {
            System.out.println(
                    "Студент факультета Слизерин " + this.getName() + " обладет такими же показателями, как и студент " + student.getName());
        } else {
            System.out.println(
                    "Студент факультета Слизерин " + this.getName() + " обладет меньшими показателями, чем студент " + student.getName());
        }
    }
}
