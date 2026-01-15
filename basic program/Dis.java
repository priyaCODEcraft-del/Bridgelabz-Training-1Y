import java.util.Scanner;
class Dis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feety= sc.nextDouble();
        double yardy=feety/3;
        double miley= yardy/1760;
        System.out.println(
            "The distance in yards is " + yardy +
            " while the distance in miles is " + miley
        );
        sc.close();
    }
}
