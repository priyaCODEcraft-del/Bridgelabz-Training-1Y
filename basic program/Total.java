import java.util.Scanner;
class Total{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double u = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();
        double total=u*q;
        System.out.println(
            "The total purchase price is INR " + total +
            " if the quantity " + q +
            " and unit price is INR " + u
        );
        sc.close();
    }
}
