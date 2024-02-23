package project.content;

public abstract class Water implements Transformable {
    private String color = "no";
    private String smell = "no";
    private String transparency = "transparent";
    private int temperature = 0;

    public Water(String color, String smell, String transparency, int temperature) {
        this.color = color;
        this.smell = smell;
        this.transparency = transparency;
        this.temperature = temperature;
    }

    public String getColor() {

        System.out.printf("Getting the color of the water").println();
        return color;
    }

    public String getSmell() {

        System.out.printf("Getting the smell of the water").println();
        return smell;
    }

    public String getTransparency() {

        System.out.printf("Getting the transparency of the water").println();
        return transparency;
    }

    public int getTemperature() {

        System.out.printf("Getting the temperature of the water").println();
        return temperature;
    }

    public void setColor(String color) {

        this.color = color;
        System.out.printf("Color of the water is set to %s").println();
    }

    public void setSmell(String smell) {

        this.smell = smell;
        System.out.printf("Smell of the water is set to %s").println();
    }

    public void setTransparency(String transparency) {

        this.transparency = transparency;
        System.out.printf("Transparency of the water is set to %s").println();
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
        System.out.printf("Temperature of the water is set to %d").println();
    }
}
