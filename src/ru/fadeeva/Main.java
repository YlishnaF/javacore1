package ru.fadeeva;

import ru.fadeeva.custommath.Decorator;
import ru.fadeeva.custommath.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /** Main method */
    public static void main(String[] args) {
        Decorator.decorate(Math.calculate("+", 1,6));
    }
}