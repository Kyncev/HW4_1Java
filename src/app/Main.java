package app;
public class Main {
    public static void main(String[] args) {
        int productNo;
        int amountDays;
        double daySale;
        double total;
        String productType;
        String currency;

        productNo = 1;
        productType = "smartphone";;
        amountDays = 5;
        total = 12153.41;
        daySale = total / amountDays;
        String result = String.format("%.2f", daySale);
        currency = "EUR";
        System.out.println("Product No " + productNo +  ":" + " " + productType + ",");
        System.out.println("total sales for "  + amountDays +  " days " + " is " + currency + " " + total + ",");
        System.out.printf("sales by day is " + currency + " " + result + ",");
        productNo = 2;
        productType = "laptop";
        currency = "EUR";
        total = 10486.85;
        daySale = total / amountDays;
        amountDays = 7;
        System.out.println(" ");
        System.out.println("Product No " + productNo +  ":" + " " + productType + ",");
        System.out.println("total sales for "  + amountDays +  " days " + " is " + currency + " " + total + ",");
        System.out.printf("sales by day is " + currency + " " + daySale + ",");
    }
}
