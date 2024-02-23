package project.matter;

public class Material {

    private double thermalConductivity;
    private String color;
    private double density;


    public Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    public double getThermalConductivity() {

        System.out.printf("The thermal conductivity of %s is %f", getClass().getSimpleName(), thermalConductivity).println();
        return thermalConductivity;
    }

    public String getColor() {

        System.out.printf("The color of %s is %s", getClass().getSimpleName(), color).println();
        return color;
    }

    public double getDensity() {

        System.out.printf("The density of %s is %f", getClass().getSimpleName(), density).println();
        return density;
    }

    public void setThermalConductivity(double thermalConductivity) {

        this.thermalConductivity = thermalConductivity;
        System.out.printf("The thermal conductivity of %s is set to %f", getClass().getSimpleName(), thermalConductivity).println();
    }

    public void setColor(String color) {

        this.color = color;
        System.out.printf("The color of %s is set to %s", getClass().getSimpleName(), color).println();
    }

    public void setDensity(double density) {

        this.density = density;
        System.out.printf("The density of %s is set to %f", getClass().getSimpleName(), density).println();
    }
}
