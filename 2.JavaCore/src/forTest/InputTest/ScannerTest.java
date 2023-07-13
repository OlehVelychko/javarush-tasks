package forTest.InputTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        File file = new File("out.log");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
