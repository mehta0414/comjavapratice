import java.util.Scanner;

public class Test27 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //We can put the more specific condition on the top of the if else condition .
    }

    void approach1() {
        System.out.print("Enter the number");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("buzz");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("fizz");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else
            System.out.println(number);
    }

    void approach2() {  // this method is clear and easier to read
        System.out.print("Enter the number");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("Fizz Buzz");
        else if (number % 3 == 0)
            System.out.println("buzz");
        else if (number % 5 == 0)
            System.out.println("fizz");
        else
            System.out.println(number);
    }

    void approach3() {

        System.out.print("Enter the number");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
