import java.text.NumberFormat;
import java.util.Scanner;

public class Test21 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //simpleInterestCalculator();
        mortageCalculator();
    }

    static void simpleInterestCalculator() {
        System.out.println("Enter the principle amount");
        String p = scanner.next().trim();
        double principle = Double.parseDouble(p);

        System.out.println("Enter annual rate of interest");
        String i = scanner.next().trim();
        double interest = Double.parseDouble(i);

        System.out.println("Enter total no of years");
        String y = scanner.next().trim();
        double years = Double.parseDouble(y);

        double simpleInterest = ((principle * interest * years) / 100);
        String SimpleInterest = NumberFormat.getCurrencyInstance().format(simpleInterest);
        System.out.println("Simple interest is " + SimpleInterest);
    }

    static void mortageCalculator() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        System.out.println("Principal:");
        String p = scanner.next().trim();
        double principle = Double.parseDouble(p);

        System.out.println("Annual Interest rate");
        String air = scanner.next().trim();
        float annualInterest = Float.parseFloat(air);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Periods(years): ");
        String y = scanner.next().trim();
        byte years = Byte.parseByte(y);
        int noOfPayements = years * MONTHS_IN_YEAR;

        double mortage = (principle * Math.pow(1 + monthlyInterest, noOfPayements)) / (Math.pow(1 + monthlyInterest, noOfPayements) - 1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Morgage: " + mortageFormatted);


    }
}
