package Back_Class.week3.day3.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileController02 {

    public void printFileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
    public void createANewFile() throws IOException {
        File file = new File("./numbers.txt");
        file.createNewFile();
        System.out.println("파일 생성 되었는지?:" + file.exists());
    }

    public void bufferedReaderByByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());

    }
    public void printLines(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void printLineCnt(String filename) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        int cnt = 0;
        String line = "";
        while ((line = br.readLine()) != null) {
//            System.out.println(line);
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        FileController02 fc = new FileController02();
//        fc.printFileList();
//        fc.printLines("8842height.phe.txt");
        String filename = "C:\\Users\\ocean\\Desktop\\2021_인구이동통계\\2021_인구관련연간자료_20220927_66125.csv";
//        fc.printLines(filename);
        fc.printLineCnt(filename);

    }
}
