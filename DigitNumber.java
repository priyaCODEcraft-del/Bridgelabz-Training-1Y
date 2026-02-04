import java.util.*;

public class DigitNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int[] arr = new int[10];
        int i = 0, max = 0;

        while (temp > 0) {
            arr[i] = temp % 10;
            if (arr[i] > max)
                max = arr[i];
            temp /= 10;
            i++;
        }

        System.out.println("Largest digit = " + max);
    }
}
