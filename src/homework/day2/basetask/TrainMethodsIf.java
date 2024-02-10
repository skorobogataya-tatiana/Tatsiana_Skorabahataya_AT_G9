package homework.day2.basetask;

public class TrainMethodsIf {
    public int returnNewInt(int num) {
        if (num < 8) {
            return num * 7;
        } else return num / 4;
    }

    public long returnNewLong(long l) {
        if (l > 300) {
            return l - 300;
        } else return l + 20;
    }

    public String returnNewChar(char ch) {
        if (ch == 'g') {
            return "go";
        } else return ("o" + String.valueOf(ch));
    }

    public float returnNewFloat(float f) {
        if (f == 0.67) {
            return f;
        } else return f * 2;
    }

    public double returnNewDouble(double d) {
        if (d > 30 && d < 80) {
            return d + 87;
        } else if (d > 80 && d < 400) {
            return d - 87;
        } else if (d > 400) {
            return d / 4;
        } else return d;
    }

    public void returnNewBoolean(boolean check) {
        if (check) {
            System.out.println("As an input I recieved true");
        } else {
            System.out.println("As an input I recieved false");
        }
    }
}
