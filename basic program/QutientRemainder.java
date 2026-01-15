import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;
        int quotient, remainder;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        quotient = number1 / number2;
        remainder = number1 % number2;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
