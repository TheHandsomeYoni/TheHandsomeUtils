package me.thehandsomeyoni.thehandsomeutils.general;

public class IntegerUtils {
    int i;

    public IntegerUtils(int i) {
        this.i = i;
    }

    public IntegerUtils(String text) {
        try{
            StringUtils s = new StringUtils(text);
            this.i = Integer.parseInt(s.removeLettersAndCharacters());
        } catch (NullPointerException e) {
            throw new NullPointerException("No number found in the string");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("There was a problem reading the number");
        }
    }

    public IntegerUtils(double d) {
        this.i = (int) d;
    }

    public IntegerUtils(float f) {
        this.i = (int) f;
    }

    public IntegerUtils(long l) {
        this.i = (int) l;
    }

    public IntegerUtils(short s) {
        this.i = (int) s;
    }

    public IntegerUtils(byte b) {
        this.i = (int) b;
    }

    public IntegerUtils(boolean b) {
        this.i = b ? 1 : 0;
    }



    // multiply.
    public int multiply(int i) {
        return this.i * i;
    }

    // divide.
    public int divide(int i) {
        return this.i / i;
    }

    // add.
    public int add(int i) {
        return this.i + i;
    }

    // subtract.
    public int subtract(int i) {
        return this.i - i;
    }

    // modulo.
    public int modulo(int i) {
        return this.i % i;
    }

    // compare.
    public int compare(int i) {
        return this.i - i;
    }

    // power.
    public int power(int i) {
        return (int) Math.pow(this.i, i);
    }

    // square root.
    public int squareRoot() {
        return (int) Math.sqrt(this.i);
    }

    // absolute value.

    public int absoluteValue() {
        return Math.abs(this.i);
    }

    // is even.

    public boolean isEven() {
        return this.i % 2 == 0;
    }

    // is odd.

    public boolean isOdd() {
        return this.i % 2 != 0;
    }

    // is prime.

public boolean isPrime() {
        if (this.i == 1) {
            return false;
        }
        for (int i = 2; i < this.i; i++) {
            if (this.i % i == 0) {
                return false;
            }
        }
        return true;
    }

    // round up.
    public int roundUp() {
        return (int) Math.ceil(this.i);
    }

    // round down.
    public int roundDown() {
        return (int) Math.floor(this.i);
    }

    // round
    public int round() {
        return (int) Math.round(this.i);
    }

    // to string.
    public String toString() {
        return Integer.toString(this.i);
    }

    // standard form.
    public float standardForm() {
        int n = 0;
        float f = this.i;
        if(f < 0) {
            throw new IllegalArgumentException("The number is negative");
        }

        while(f > 10) {
            f /= 10;
            n++;
            if(f == 10){
                f /= 10;
                n++;
            }
        }
        System.out.println(f + "*10^" + n);
        return f;

    }




}
