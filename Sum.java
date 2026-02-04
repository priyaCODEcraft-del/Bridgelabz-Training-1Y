import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        int i = 0;
        double sum = 0;

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0 || i == 10)
                break;

            arr[i] = num;
            sum += num;
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("\nSum = " + sum);
    }
}
