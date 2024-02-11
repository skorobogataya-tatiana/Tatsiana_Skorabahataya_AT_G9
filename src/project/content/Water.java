package project.content;

public abstract class Water {
    private String color = "no";
    private String smell = "no";
    private String transperency = "transparent";
    private int temperature = 0;

    public Water(String color, String smell, String transperency, int temperature) {
        this.color = color;
        this.smell = smell;
        this.transperency = transperency;
        this.temperature = temperature;
    }

    public String getColor() {

        return color;
    }

    public String getSmell() {

        return smell;
    }

    public String getTransperency() {

        return transperency;
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

    public void setTransperency(String transperency) {

        this.transperency = transperency;
    }

    public void setTemperatre(int temperature) {

        this.temperature = temperature;
    }
}
