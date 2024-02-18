package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X arg1) {

        return "I received 1 argument of type: " + arg1.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X arg1, Y arg2) {

        return "I received 2 arguments of type: " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X one, Y two, String str) {
        int len = str.length();
        System.out.printf("I got an object of %s class and %s class and string with %d characters", one.getClass().getSimpleName(), two.getClass().getSimpleName(), len).println();
    }

    public void genericMethodHalfGenArgs(X one, String str) {
        int len = str.length();
        System.out.printf("I got an object of %s class and string with %d characters", one.getClass().getSimpleName(), len).println();
    }

}
