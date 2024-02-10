package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects show = new TrainMethodsObjects();
        Mouse mouse = new Mouse("Mikky", 2);
        Souce souce = new Souce("Balognese", "white");
        Bee bee = new Bee("Female", 2);
        Obstacle obstacle = new Obstacle("VDI can not be started", "medium");
        Pineapple pineapple = new Pineapple("Red Spanish", 3000.11);

        show.processMouse(mouse);
        System.out.println();
        show.processSouce(souce);
        System.out.println();
        show.processBee(bee);
        System.out.println();
        show.processObstacle(obstacle);
        System.out.println();
        show.processPineapple(pineapple);
    }
}
