import java.util.*;
class missingNum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<=n;i++){
      boolean isfound=false;
      for(int j=0;j<arr.length;j++){
        if(arr[j]==i){
          isfound=true;
          break;
        }
      }
      if(!isfound){
        System.out.print(i+" ");
      }
    }
  }
}