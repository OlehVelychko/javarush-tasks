package forTest;
public class MoneyIphoneTest {
    public static void main(String[] args) {
        int iphonePriceUAH = 51000;
        int ipadPriceUAH = 22500;

        int total = iphonePriceUAH + ipadPriceUAH;

        int countDollars = 1500;
        int countEuro = 200;

        double dollarExchangeRate = 37.50;
        double euroExchangeRate = 40.00;

        double creditАacilities = total - (countDollars * dollarExchangeRate) - (countEuro * euroExchangeRate);

        System.out.println("Необходимая сумма с кредитки: " + creditАacilities);
    }
}
