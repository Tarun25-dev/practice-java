import java.util.*;
class reverseString{
   public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String reversed="";
     for(int i=str.length()-1;i>=0;i--){
       reversed +=str.charAt(i);      
     }
     System.out.println(reversed);
     if(str.equals(reversed)){
      System.out.println("Polindrome");
     }
     else{
       System.out.println("not Polindrome");
     }
   }
}