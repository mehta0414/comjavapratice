public class Test22 {
    public static void main(String[] args) {
        /*
        Comparisons Operators:
         */
        int x = 1;
        int y = 1;
        // == equality operator
        System.out.println(x == y);
        System.out.println(x != y);

        int temperature = 22;
        boolean isWarm = (temperature > 20 && temperature < 30);
        System.out.println("Is Warm: " + isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean clearCriminialRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && clearCriminialRecord;
        System.out.println("Is Eligible: " + isEligible);
    }
}
