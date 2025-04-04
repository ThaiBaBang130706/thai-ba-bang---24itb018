package bai3;

import java.io.*;

public class Filecount {
    public static void main(String[] args) {
        String sourceFile = "C://Users//USER//OneDrive//Documents//input1.txt/"; // Đường dẫn file nguồn

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }

            System.out.println("Số dòng trong file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}