package homework.day2.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn pifpaf = new TrainMethodsReturn();
        System.out.println("Method returnNewInt returned " + pifpaf.returnNewInt(158));
        System.out.println("Method returnNewLong returned " + pifpaf.returnNewLong(1789));
        System.out.println("Method returnNewShort returned " + pifpaf.returnNewShort((short) 127));
        System.out.println("Method returnNewByte returned " + pifpaf.returnNewByte((byte) 13));
        System.out.println("Method returnNewDouble returned " + pifpaf.returnNewDouble(100.99));
        System.out.println("Method returnNewFloat returned " + pifpaf.returnNewFloat((float) 100.99));
        System.out.println("Method returnNewChar returned " + pifpaf.returnNewChar('T'));
        System.out.println("Method returnNewBoolean returned " + pifpaf.returnNewBoolean(false));

    }
}
