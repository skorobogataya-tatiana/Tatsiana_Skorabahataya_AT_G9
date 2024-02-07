package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int x) {
        return x * 3;
    }

    public long returnNewLong(long l) {
        return l - 4;
    }

    public String returnNewChar(char ch) {
        String result = String.valueOf(ch) + ch;
        return result;
    }

    public float returnNewFloat(float f) {
        return f / 2;
    }

    public double returnNewDouble(double d) {
        return d + 8;
    }

    public short returnNewShort(short sh) {
        return (short)(sh - 1);
    }

    public byte returnNewByte(byte b) {
        return (byte)(b * 2);
    }

    public boolean returnNewBoolean(boolean check) {
        return !check;
    }
}
