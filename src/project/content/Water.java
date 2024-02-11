package project.content;

public abstract class Water {
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

        return color;
    }

    public String getSmell() {

        return smell;
    }

    public String getTransparency() {

        return transparency;
    }

    public int getTemperature() {

        return temperature;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTransparency(String transparency) {

        this.transparency = transparency;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }
}
