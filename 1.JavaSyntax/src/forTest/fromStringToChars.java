package forTest;

public class fromStringToChars {
    public static void main(String[] args) {
        String stroka = "Oleh";
        char[] simvoli = stroka.toCharArray();

        for (int i = 0; i < simvoli.length; i++) {
            System.out.println(simvoli[i]);
        }
    }

}
