import java.util.*;
class nonRepetiveFirstElement{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      int count=0;
      for(int j=0;j<str.length();j++){
        if(str.charAt(j) == c){
          count++;
        }
      }
      if(count==1){
          result+=c;
          break;
      }
    }
    System.out.println("first non repetive letter is : "+result.charAt(0));
  }
}       