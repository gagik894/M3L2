import java.io.*;

public class CloneFile {
    public static void main(String[] args) {
        CloneFile cloneFile = new CloneFile();
        try {
            cloneFile.cloneFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cloneFile() throws IOException {
        FileReader in = new FileReader("In1.txt");
        File file = new File("In1.txt");
        String fileName = "OutWithLength";
        fileName += file.length() + ".txt";
        FileWriter out = new FileWriter(fileName);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
    }
}