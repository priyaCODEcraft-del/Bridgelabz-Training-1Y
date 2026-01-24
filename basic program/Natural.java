import java.util.Scanner;
public class Natural{
  public static void main(String [] args){
  Scanner s= new Scanner(System.in);
  System.out.println("enter the n ");
  int n = s.nextInt();
  if(n>=0){
  int sum=n*(n+1)/2;
  System.out.println("The sum of "+n+"natural number is "+sum);
  }
  else{
  System.out.println("The number "+n+"is not natural number");
  }
  }
  }
  
  