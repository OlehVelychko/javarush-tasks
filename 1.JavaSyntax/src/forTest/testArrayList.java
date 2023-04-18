package forTest;

import java.util.ArrayList;

public class testArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("qqq");
        list.add("www");
        list.add("eee");
        list.add("rrr");

        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
