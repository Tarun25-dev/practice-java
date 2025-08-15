/*import java.util.*;
class stringRotationCheck{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(str1.length() == str2.length() && (str1+str1).contains(str2)){
      System.out.println("String rotated");
    }
    else{
      System.out.println("String not rotated");
    }
  }
}
*/

//ex
//abcd --string1 input
//cdab --string2 input
//shift left by 2 which means 0,1 index has moved to the last

//using for loop by checking each combination with str2
import java.util.*;
class stringRotationCheck{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    boolean isRotated =false;
    if(str1.length()!=str2.length()){
      System.out.println("Not a rotation");
      return;
    }
    for(int i=0;i<str1.length();i++){
      String rotated=str1.substring(i)+str1.substring(0,i);
      if(str2.equals(rotated)){
        System.out.println("string rotated");
        break;
      }
    }
  }
} 


