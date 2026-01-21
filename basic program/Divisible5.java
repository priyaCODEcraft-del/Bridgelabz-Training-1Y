import java.util.Scanner;
public class Divisible5{
 public static void main(String[] args){
 Scanner S = new Scanner(System.in);
 System.out.println("Enter number:");
 int number= S.nextInt();
 if(number%5==0){
 System.out.println("Is the number"+number+"divisible by 5 ?Yes");
 }
 else {
 System.out.println("Is the number"+number+"divisible by 5 ?NO");
 }
 }
 }