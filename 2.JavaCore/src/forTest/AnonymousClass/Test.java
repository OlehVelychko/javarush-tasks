package forTest.AnonymousClass;

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("This is Anonymous!");
            }
        };

        ableToEat.eat();
    }
}
