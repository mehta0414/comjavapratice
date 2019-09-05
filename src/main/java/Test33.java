import java.text.NumberFormat;
import java.util.Scanner;

public class Test33 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double principle = 0;
        float monthlyInterest = 0;
        int noOfPayements = 0;

        while (true) {
            System.out.println("Principal($1K-$1M");
            String p = scanner.next().trim();
            principle = Double.parseDouble(p);
            if (principle >= 1_000 && principle <= 100_000)
                break;
            System.out.println("Enter the value between 1000 and 100000");
        }


        while (true) {
            System.out.println("Annual Interest rate");
            String air = scanner.next().trim();
            float annualInterest = Float.parseFloat(air);
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.println("Periods(years): ");
            String y = scanner.next().trim();
            byte years = Byte.parseByte(y);
            if (years >= 1 && years <= 30) {
                noOfPayements = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        double mortage = (principle * Math.pow(1 + monthlyInterest, noOfPayements)) / (Math.pow(1 + monthlyInterest, noOfPayements) - 1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Morgage: " + mortageFormatted);
    }
}
