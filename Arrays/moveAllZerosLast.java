import java.util.*;
class moveAllZerosLast{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int index=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] != 0){
        arr[index]=arr[i];
        index++;
      }
    }
    while(index<n){
        arr[index]=0;
        index++;
    }
    System.out.println(Arrays.toString(arr));
  }
}
    