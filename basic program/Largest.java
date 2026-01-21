import java.util.Scanner;
 public class Largest{
    public static void main(String [] args){
    Scanner S= new Scanner(System.in);
    System.out.println("number1:");
    int number1= S.nextInt();
    System.out.println("number2");
    int number2=S.nextInt();
	System.out.println("number3");
	int number3=S.nextInt();
	if(number1>number2 && number2>number3){
	System.out.println("Is first number the Largest?  yes");
	System.out.println("Is second number the  Largest ?  No");
	System.out.println("Is third number the  Largest?  No");
	}
	
	else if(number2>number1 && number1>number3){
	System.out.println("Is first  number the Largest?  No");
	System.out.println("Is second number the  Largest ?  yes");
	System.out.println("Is third number the  Largest?  No");
	}
	else if(number3>number2 && number2>number1){
	System.out.println("Is first  number the Largest?  No");
	System.out.println("Is second number the  Largest ? NO");
	System.out.println("Is third number the  Largest?  Yes");
	}
	}
	}