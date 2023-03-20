package forTest;

import java.util.Arrays;

public class testArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7};
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, 0, 4);
        System.out.println(Arrays.toString(array));
        int key = Arrays.binarySearch(array, 5);
        System.out.println(key);
        System.out.println(Arrays.binarySearch(array, 0));
//        testArray.main();
    }
}
