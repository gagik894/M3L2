import java.io.*;
import java.util.Scanner;

public class ConcatenateFiles {
    public static void main(String[] args) {
        ConcatenateFiles concatenateFiles = new ConcatenateFiles();
        try {
            concatenateFiles.concatenate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void concatenate() throws IOException {
        File fileIn1 = new File("in1.txt");
        File fileIn2 = new File("in2.txt");
        File fileOut = new File("out.txt");
        if (fileOut.exists()){
            fileOut.delete();
            fileOut = new File("cd.txt");
        }
        copyTo(fileIn1,fileOut);
        copyTo(fileIn2,fileOut);
    }

    public static void copyTo(File file1, File file2) throws IOException {
        Scanner sc = new Scanner(file1);
        FileWriter fw = new FileWriter(file2,true);
        while (sc.hasNext()){
            fw.write(sc.nextLine());
        }
        sc.close();
        fw.close();
    }
}