package project.boxing;

import project.content.Transformable;

public interface Containable {

    void addStuff (Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
}
