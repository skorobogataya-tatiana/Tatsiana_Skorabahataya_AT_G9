package homework.day2.basetask;

public class Pineapple {
    private String grade;
    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails(Pineapple pineapple) {
        if (pineapple.getHeatCapacity() > 2140) {
            System.out.println("I am a pineapple with heat capacity bigger than of ham's.");
        } else {
            System.out.println("Ham stores more heat.");
        }

    }
}
