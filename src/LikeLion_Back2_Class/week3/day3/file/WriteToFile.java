package LikeLion_Back2_Class.week3.day3.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void writeJustANumber() throws IOException {
        // 10이라는 숫자를 "ten_million_numbers.txt"에 쓰기
        File file = new File("ten_million_numbers.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("10\n");
        fileWriter.flush();
        fileWriter.close();
    }

    public void writeNumbersInAnArr(int[] arr) throws IOException {
        // 10이라는 숫자를 "ten_million_numbers.txt"에 쓰기
        File file = new File("ten_million_numbers.txt");
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < arr.length; i++) {
            fileWriter.write(String.valueOf(arr[i]) + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
        System.out.println("success");
    }
    public static void main(String[] args) throws IOException {
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.writeNumbersInAnArr(new int[]{10, 20, 30, 40});

    }
}
