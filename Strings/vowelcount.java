import java.util.*;
class vowelcount{
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine().toLowerCase();
       int vowels=0;
       int consonents=0;
       for(int i=0;i<str.length();i++){
          int ch=str.charAt(i);
          if(ch>='a' && ch<='z'){
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels+=1;
             }
          }
          else{
            System.out.println("string consists not only alphabets");
            return;
          }
       }
       consonents=str.length()-vowels;
       System.out.println("TOTAL VOWELS ARE : "+vowels);
       System.out.println("TOTAL CONSONENTS ARE : "+consonents);
       
     }
}