import java.util.Scanner;
class Calc{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Give me a number: ");
        double numOne = s.nextDouble();
        System.out.print("Give me another number: ");
        double numTwo = s.nextDouble();
        double sumThing = numOne + numTwo;
        double minusThing = numOne - numTwo;
        double timesThing = numOne * numTwo;
        double divThing = numOne / numTwo;
        System.out.println(
            "Results for numbers " + numOne + " and " + numTwo + " => " +
            "Add: " + sumThing + ", Subtract: " + minusThing +
            ", Multiply: " + timesThing + ", Divide: " + divThing
        );
        s.close();
    }
}
