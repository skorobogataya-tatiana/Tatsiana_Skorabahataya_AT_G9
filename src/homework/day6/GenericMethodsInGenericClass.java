package homework.day6;

public class GenericMethodsInGenericClass<T> {
    public void genericMethodOneGenArg(T some) {
        System.out.printf("I am an object of %s class.", some.getClass().getSimpleName()).println();
    }

    public <G> void genericMethodTwoGenArgs(T one, G two) {
        System.out.printf("We are objects of %s class and %s class.", one.getClass().getSimpleName(), two.getClass().getSimpleName()).println();
    }

    public void genericMethodHalfGenArgs(T obj, String string) {
        int numberOfChars = string.length();
        System.out.printf("I got an object of %s class and string with %d characters", obj.getClass().getSimpleName(), numberOfChars).println();
    }
}
