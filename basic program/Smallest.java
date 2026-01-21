import java.util.Scanner;
 public class Smallest{
    public static void main(String [] args){
    Scanner S= new Scanner(System.in);
    System.out.println("number1:");
    int number1= S.nextInt();
    System.out.println("number2");
    int number2=S.nextInt();
	System.out.println("number3");
	int number3=S.nextInt();
	if(number1<number2 && number2<number3){
	System.out.println("Is first number the smallest?  yes");
	}else{
	System.out.println("Is first number the smallest?  No");
	}
	}
	}