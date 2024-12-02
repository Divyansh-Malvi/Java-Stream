import java.io.File;
import java.util.Scanner;

public class ScannerReadFileData {
    public static void main(String[] args) {
        File f = new File("D:\\Test1.txt");
        try{
            Scanner scanner = new Scanner(f);
            String data;
            while (scanner.hasNextLine()) {
                data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
