package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T some) {
        System.out.printf("I am an object of %s class.", some.getClass().getSimpleName()).println();
    }

    public <G> String genericMethodTwoGenArgs(T one, G two) {
        String className1 = one.getClass().getSimpleName();
        String className2 = two.getClass().getSimpleName();
        return "We are objects of " + className1 + " class and " + className2 + " class.";
    }

    public void genericMethodHalfGenArgs(T obj, String string) {
        int numberOfChars = string.length();
        System.out.printf("I got an object of %s class and string with %d characters", obj.getClass().getSimpleName(), numberOfChars).println();
    }
}
