package homework.day7;

import homework.day5.playground.essence.creatures.Fly;

import java.io.*;

public class MyDeserializationTest implements Serializable {

    public void deserializeObject() {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\myObject");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Fly newFly = (Fly)ois.readObject();
            System.out.printf("A new object of %s class was deserialized. My name is %s, my mass is %d", newFly.getClass().getSimpleName(), newFly.getName(), newFly.getMass()).println();

            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\myObjectDeserialized"));
            out.write(newFly.toString());
            out.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        MyDeserializationTest deserializationTest = new MyDeserializationTest();
        deserializationTest.deserializeObject();

    }
}
