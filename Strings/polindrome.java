//for strings
/*
import java.util.*;
class polindrome{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String original=sc.nextLine();    
    String reversed="";
    for(int i=original.length()-1;i>=0;i--){
        reversed+=original.charAt(i);
    }
    if(original.equals(reversed))
     System.out.println("Given String is a Polindrome");
    else
     System.out.println("Given String is not a Polindrome");
  }
}
*/

//for numbers

import java.util.*;
class polindrome{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();  
    int original=number;  
    int reversed=0;
    while(number!=0){
       reversed=reversed*10+number%10;
       number=number/10;
    }
    System.out.println(reversed);
    if(original==reversed)
     System.out.println("Given number is a Polindrome");
    else
     System.out.println("Given number is not a Polindrome");
  }
}