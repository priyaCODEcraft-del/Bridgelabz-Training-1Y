import java.util.Scanner;
class Tri{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base of triangle in cm: ");
        double b= sc.nextDouble();
        System.out.print("Enter height of triangle in cm: ");
        double h= sc.nextDouble();
        double areaC=0.5*b*h;
        double areaI= areaC/(2.54*2.54);
        System.out.println(
            "The area of the triangle in sq in is " + areaI +
            " and sq cm is " + areaC
        );
        sc.close();
    }
}
