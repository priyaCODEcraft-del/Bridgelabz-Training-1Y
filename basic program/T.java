import java.util.Scanner;
class T{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double pricey = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qtyy = sc.nextInt();
        double totaly= pricey*qtyy;
        System.out.println(
            "The total purchase price is INR " + totaly +
            " if the quantity " + qtyy +
            " and unit price is INR " + pricey
        );
        sc.close();
    }
}
