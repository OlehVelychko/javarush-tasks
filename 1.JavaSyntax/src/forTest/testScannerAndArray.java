package forTest;

import java.util.Arrays;
import java.util.Scanner;

public class testScannerAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count grades:");
        int count = scanner.nextInt();
        int[] grades = new int[count];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(grades));
    }
}
