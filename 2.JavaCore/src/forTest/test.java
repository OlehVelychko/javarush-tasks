package forTest;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        list.add(3);
        list.add(8);
        list.add(2);

        printListValues(list);
    }


    public static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
