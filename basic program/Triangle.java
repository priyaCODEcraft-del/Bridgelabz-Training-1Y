import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (in inches): ");
        double b = sc.nextDouble();
        System.out.print("Enter height (in inches): ");
        double h = sc.nextDouble();
        double a = 0.5*b*h;
        double as = a*6.4516;
        System.out.println(
            "The area of the triangle with base " + b +
            " inches and height " + h +
            " inches is " + a +
            " square inches and " + as +
            " square centimeters."
        );
        sc.close();
    }
}
