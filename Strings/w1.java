import java.util.*;
class w1{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int first=str.length()-1;
     first=first/2;
     if(first % 2 == 0){
       System.out.println(first);

     }
     else{
         System.out.println("tharun");
     }
   }
}