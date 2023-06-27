package ru.fadeeva.custommath;

/**
 * class Math, you can use 4 operations: -,+,*,/
 */
public class Math {
    /**
     * static method calculate, needs 3 args
     *
     * @param s Operate
     * @param a first num
     * @param b second num
     */
    public static String calculate(String s, int a, int b) {
        switch (s) {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                return String.valueOf(a / b);
        }
        return "error!";
    }
}
