package ru.fadeeva.lastlession;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TicTacToeGame {
    public static void main(String[] args) {
        String file = "/path/to/game/file.txt";
        try {
            int[] field = loadGameFromFile(file);
            printGameField(field);
        } catch (IOException e) {
            System.out.println("Ошибка загрузки игры из файла: " + e.getMessage());
        }
    }

    public static int[] saveGameToFile(String file, int[] field) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            for (int j : field) {
                outputStream.write(j);
            }
        }
        return field;
    }

    public static int[] loadGameFromFile(String file) throws IOException {
        int[] field = new int[9];
        try (FileInputStream inputStream = new FileInputStream(file)) {
            for (int i = 0; i < field.length; i++) {
                int value = inputStream.read();
                field[i] = value;
            }
        }
        return field;
    }

    public static void printGameField(int[] field) {
        char[] symbols = {' ', 'x', 'o', '.'};
        for (int i = 0; i < field.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(symbols[field[i]]);
            System.out.print(' ');
        }
    }
}
