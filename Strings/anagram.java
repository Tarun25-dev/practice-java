import java.util.*;
class anagram{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String first=sc.nextLine().toLowerCase();    
    String second=sc.nextLine().toLowerCase();
    int arr[]=new int[26];
    if(first.length() !=second.length()){
      System.out.println("length mismatch");
      return;
    }
    for(int i=0;i<first.length();i++){
    char c=first.charAt(i); //taking first char and incriment
    arr[c-'a']++; //it calulates ascii values instead of 'a' we can write 0 also
    }
    for(int i=0;i<second.length();i++){
    char c=second.charAt(i);
    arr[c-'a']--;
    }       
    for(int i=0;i<arr.length;i++){
       if(arr[i]!=0){
         System.out.println("Given strings are not anagram");
         return;
       }
    } 
    System.out.println("Given strings are anagram");
  }
}