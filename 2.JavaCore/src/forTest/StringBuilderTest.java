package forTest;

public class StringBuilderTest {

    public static void main(String[] args) {
        /*java.lang.StringBuilder builder = new java.lang.StringBuilder("lvl=15&view&name=Amigo");
        int lastIndexDrop = builder.indexOf("&");
        java.lang.StringBuilder pair = new java.lang.StringBuilder(builder.substring(0, lastIndexDrop));
        System.out.println(pair);
        System.out.println(builder);
        builder.delete(0, lastIndexDrop + 1);
        System.out.println(builder);*/

        String url = "http://javarush.ru/alpha/index.html?lvl=15&obj=15&name=Amigo";
        int needIndexObj = url.indexOf("obj=");
        String res = url.substring(needIndexObj + 4);
        int indexEnd;
        System.out.println(res);

    }


}
