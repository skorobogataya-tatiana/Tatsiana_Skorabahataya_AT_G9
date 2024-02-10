package homework.day2.basetask;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails(Mouse mouse) {
        System.out.println("I am a mouse. My name is " + mouse.getName() + ". And my age is " + mouse.getAge() + ".");
    }
}
