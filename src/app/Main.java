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
        productType = "smartphone";
        daySale = 2430.68;
        amountDays = 5;
        total = daySale * amountDays;
        currency = "EUR";
        System.out.println("Product No " + productNo +  ":" + " " + productType + ",");
        System.out.println("total sales for "  + amountDays +  " is " + currency + " " + Math.round(total) + ",");
        System.out.println("sales by day is " + currency + " " + Math.round(daySale) + ",");
        productNo = 2;
        productType = "laptop";
        currency = "EUR";
        daySale = 1498.12;
        amountDays = 7;
        total = daySale * amountDays;
        System.out.println("Product No " + productNo +  ":" + " " + productType + ",");
        System.out.println("total sales for "  + amountDays +  " is " + currency + " " + Math.round(total) + ",");
        System.out.println("sales by day is " + currency + " " + Math.round(daySale) + ",");
    }
}
