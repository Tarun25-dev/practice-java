import java.util.*;
class reverseNum{
   public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     int number=sc.nextInt();
     int original=number;
     int reversed=0;
     while(number!=0){
         reversed=reversed*10+number%10;
         number=number/10;
     }
//for reverse of a number
 
     System.out.println(reversed);

  
//for polindrome

     if(original == reversed){
        System.out.println("polindrome");
     }
     else{
      System.out.println("Not polindrome");
     }
   }
}