package homework.day2.basetask;

public class Souce {
    private String name;
    private String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails(Souce souce) {
        System.out.println("This is " + souce.getName() + " souce of " + souce.getColor() + " color.");
    }
}
