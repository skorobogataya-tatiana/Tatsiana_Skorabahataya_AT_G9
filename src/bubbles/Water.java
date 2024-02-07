package bubbles;

public abstract class Water {
    private String color;
    private String smell;
    private double transperency;
    private double temperature;

    public Water(String color, String smell, double transperency, double temperature) {
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

    public double getTransperency() {
        return transperency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTransperency(double transperency) {
        this.transperency = transperency;
    }

    public void setTemperatre(double temperature) {
        this.temperature = temperature;
    }
}
