import java.util.*;
class removedup{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    String str=sc.nextLine();
    StringBuilder sb=new StringBuilder();
    boolean[] arr=new boolean[256];
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(!arr[c]){
        arr[c]=true;
        sb.append(c);
      }
    }
   System.out.println(sb.toString());
  }
}        