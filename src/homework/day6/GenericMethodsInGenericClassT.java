package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T some) {
        System.out.printf("I am an object of %s class.", some.getClass().getSimpleName()).println();
    }

    public <G> String genericMethodTwoGenArgs(T one, G two) {

        return "We are objects of " + one.getClass().getSimpleName() + " class and " + two.getClass().getSimpleName() + " class.";
    }

    public void genericMethodHalfGenArgs(T obj, String string) {
        int numberOfChars = string.length();
        System.out.printf("I got an object of %s class and string with %d characters", obj.getClass().getSimpleName(), numberOfChars).println();
    }
}
