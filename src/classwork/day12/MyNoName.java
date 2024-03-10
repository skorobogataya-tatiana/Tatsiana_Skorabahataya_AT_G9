package classwork.day12;

public class MyNoName {
    {
        System.out.println("Hohoho-lalala");
        int t = 1;
        System.out.println(t);
    }

    //can be used for precondition execution
    static {
        System.out.println("This is a static method without name");
    }

    public static void main(String[] args) {
        new MyNoName();
    }
}
