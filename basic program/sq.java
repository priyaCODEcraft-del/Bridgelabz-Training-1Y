import java.util.Scanner;
class Sq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double peri= sc.nextDouble();
        double sidey= peri/4;
        System.out.println(
            "The length of the side is " + sidey +
            " whose perimeter is " + peri
        );
        sc.close();
    }
}
