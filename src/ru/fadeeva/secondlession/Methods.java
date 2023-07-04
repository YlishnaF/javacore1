package ru.fadeeva.secondlession;

public class Methods {
    public static void main(String[] args) {
        int[] m = {1, 6, 4, 34, 0, 0, 8, 9};
        System.out.println(countEvents(m));
        System.out.println(diff(m));
        System.out.println(twoZero(m));

    }

    //    Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static int countEvents(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //    Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
    public static int diff(int[] mas) {
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return max - min;
    }

//    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

    public static boolean twoZero(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                if (count == 1) return true;
                else count++;
            } else count = 0;
        }
        return false;
    }
}
