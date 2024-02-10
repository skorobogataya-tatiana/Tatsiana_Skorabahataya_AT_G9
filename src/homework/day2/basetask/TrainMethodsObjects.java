package homework.day2.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println("Name: " + mouse.getName());
        System.out.println("Age: " + mouse.getAge());
        mouse.printMouseDetails(mouse);
    }

    public void processSouce(Souce souce) {
        System.out.println("Name: " + souce.getName());
        System.out.println("Colour: " + souce.getColor());
        souce.printSouceDetails(souce);
    }

    public void processBee(Bee bee) {
        System.out.println("Gender: " + bee.getGender());
        System.out.println("Weight: " + bee.getWeight());
        bee.printBeeDetails(bee);
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Description: " + obstacle.getDescription());
        System.out.println("Severity: " + obstacle.getSeverity());
        obstacle.printObstacleDetails(obstacle);
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("Grade: " + pineapple.getGrade());
        System.out.println("Heat capacity: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails(pineapple);
    }
}
