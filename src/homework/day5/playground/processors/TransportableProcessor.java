package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), distance);
        System.out.println();
    }

    public void runTransportable(Transportable transportable) {
        int distance = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.printf("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), distance);
        System.out.println();
    }
}
