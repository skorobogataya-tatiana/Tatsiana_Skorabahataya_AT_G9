package homework.day6;

import homework.day5.playground.essence.creatures.Fly;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClass<String> genericMethodsInGenericClass = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass.genericMethodOneGenArg("Test");

        GenericMethodsInGenericClass<Integer> genericMethodsInGenericClass1 = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass1.genericMethodOneGenArg(700);

        GenericMethodsInGenericClass<Fly> genericMethodsInGenericClass2 = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass2.genericMethodOneGenArg(new Fly(12, "Tosya"));

        GenericMethodsInGenericClass<String> genericMethodsInGenericClass3 = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass3.genericMethodTwoGenArgs("Hello!", 800);

        GenericMethodsInGenericClass<Fly> genericMethodsInGenericClass4 = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass4.genericMethodTwoGenArgs(new Fly(10, "Milly"), "I am small");

        GenericMethodsInGenericClass<Fly> genericMethodsInGenericClass5 = new GenericMethodsInGenericClass<>();
        genericMethodsInGenericClass5.genericMethodHalfGenArgs(new Fly(10, "Bob"), "This is a test string");


    }
}
