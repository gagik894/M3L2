import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CompareFiles {
    public static void main(String[] args) {
        CompareFiles compareFiles = new CompareFiles();
        try {
            System.out.println(compareFiles.compare());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public int compare() throws FileNotFoundException {
        File fileIn1 = new File("In1.txt");
        File fileIn2 = new File("In2.txt");
        int count = 0;
        Scanner sc1  = new Scanner(fileIn1);
        Scanner sc2  = new Scanner(fileIn2);
        if (fileIn1.length()>fileIn2.length()){
            while (sc1.hasNext()){
                try {
                    String str1 = sc1.nextLine();
                    String str2 = sc2.nextLine();
                    if (!str1.equals(str2)){
                        count++;
                    }
                }catch (NoSuchElementException e){
                    count++;
                }
            }
        }else{
            while (sc2.hasNext()){
                try {
                    String str1 = sc1.nextLine();
                    String str2 = sc2.nextLine();
                    if (!str1.equals(str2)){
                        count++;
                    }
                }catch (NoSuchElementException e){
                    count++;
                }
            }
        }
        return count;
    }
}