package homework.day7;

import homework.day5.playground.essence.creatures.Fly;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MySerializationTest implements Serializable {

    public void serializeObject() {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\myObject");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Fly littleFly = new Fly(10, "Little fly");
            oos.writeObject(littleFly);

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        MySerializationTest serializationTest = new MySerializationTest();
        serializationTest.serializeObject();
        System.out.println("Done!");
    }
}

