public class Increment{
  public static  void main(String[] args){
  int i=0;
  System.out.println("value a:"+i); //0
  i++;
  System.out.println("value a:"+i++);  //1
  System.out.println("value a:"+i);   //2
  ++i;
  System.out.println("value a:"+i++); //3
  System.out.println("value a:"+i);   //4  
  System.out.println("value a:"+i);
  System.out.println("value a:"+i++);
  System.out.println("value a:"+--i);
  System.out.println("value a:"+i);
  System.out.println("value a:"+++i);
  
  
  
  //for loop
   for (int a=0;a<10;i++){
   System.out.println("value :"+a);
   }
     
	 
	 //while loop
   int j=10;
   while(j>0){
   System.out.println("j:"+j);
   j--;
   }
  
  
  //do-while
 int k=10;
 do{
 System.out.println("value k:"+k);
 k--;
 }
while(k>0);
}
}
 } 
  
  