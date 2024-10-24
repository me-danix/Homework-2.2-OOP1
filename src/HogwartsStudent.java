public abstract class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgression;

    public HogwartsStudent(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                ": сила магии - " + magicPower +
                ", расстояние трансгрессии - " + transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareStudent(HogwartsStudent student) {
        if (this.getMagicPower() + this.getTransgression() > student.getMagicPower() + student.getTransgression()) {
            System.out.println(
                    "Студент Хогвартса " + this.getName() + " обладет бОльшими показателями, чем студент " + student.getName());
        } else if (this.getMagicPower() + this.getTransgression() == student.getMagicPower() + student.getTransgression()) {
            System.out.println(
                    "Студент Хогвартса " + this.getName() + " обладет такими же показателями, как и студент " + student.getName());
        } else {
            System.out.println(
                    "Студент Хогвартса " + this.getName() + " обладет меньшими показателями, чем студент " + student.getName());
        }
    }
}
