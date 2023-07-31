package ru.fadeeva.lastlession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Backup {
    public static void main(String[] args) {
        String fromDir = "/path/to/source/directory";
        String toDir = "/path/to/backup/directory";

        try {
            createBackup(fromDir, toDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createBackup(String sourceDir, String backupDir) throws IOException {
        File from = new File(sourceDir);
        File to = new File(backupDir);

        if (!from.isDirectory()) {
            throw new IllegalArgumentException("Не является директорией");
        }

        if (!to.exists()) {
            to.mkdirs();
        }

        File[] files = from.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    File backupFile = new File(backupDir + "/" + file.getName());
                    copyFile(file, backupFile);
                }
            }
        }
    }

    public static void copyFile(File from, File to) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(from);
             FileOutputStream outputStream = new FileOutputStream(to)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
