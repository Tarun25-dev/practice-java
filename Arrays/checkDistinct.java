import java.util.*;
class checkDistinct{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<arr.length-1;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
       boolean isDistinct=true;
         for(int j=0;j<i;j++){
           if(arr[i] == arr[j]){
             isDistinct=false;
             break;
           }
         }
         if(isDistinct){
            count++;
         }
    }
    System.out.println("distinct elements are :"+count);
  }
}
      