package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf check = new TrainMethodsIf();
        System.out.println("Method returnNewInt returned " + check.returnNewInt(80));
        System.out.println("Method returnNewChar returned " + check.returnNewChar('t'));
        System.out.println("Method returnNewDouble returned " + check.returnNewDouble(120.305));
        System.out.println("Method returnNewFloat returned " + check.returnNewFloat((float) 80.60));
        System.out.println("Method returnNewLong returned " + check.returnNewLong((long) 3006));
        check.returnNewBoolean(true);
    }
}
