//1.filling of an array
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr[]=new int[10];
      Arrays.fill(arr,10);
      System.out.println(Arrays.toString(arr));
   }
}
*/



//2.filling of an array with range
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr[]={1,2,3,4,5,6,7,8,9};
      Arrays.fill(arr,1,5,4);
      System.out.println(Arrays.toString(arr));
   }
}
*/



//3.copying an arrray
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr[]={1,2,3,4,5,6,7,8,9};
      int arr1[]=Arrays.copyOf(arr,3);
      System.out.println(Arrays.toString(arr1));
   }
}
*/



//4.copying an arrray with range
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr[]={1,2,3,4,5,6,7,8,9};
      int arr1[]=Arrays.copyOfRange(arr,3,5);
      System.out.println(Arrays.toString(arr1));
   }
}
*/



//5.search element in an array
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr[]={1,2,3,4,5,6,7,8,9};
       //binarysearch works only when array is in sorted
       System.out.println(Arrays.binarySearch(arr,5));
   }
}
*/




//6.check if element is in an array
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr[]={10,5,20,15,30,25,60,55,45};
       //binarysearch works only when array is in sorted
       Arrays.sort(arr);
       int target=60;
       int index=Arrays.binarySearch(arr,target);
       if(index>=0)
       System.out.println("The targeted value "+target+" is at index "+index);
       else
       System.out.println("The targeted value "+target+" is not found");
   }
}
*/




//7.1. comparing an arrays with equals() method which outputs true or false
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr1[]={10,5,20,15,30,25,60,55,45};
       int arr2[]={10,5,20,15,30,25,60,55,45};
       boolean TorF=Arrays.equals(arr1,arr2);
       if(TorF==true)
       System.out.println("The two arrays are equal");
       else
       System.out.println("The two arrays are not eaual");
  }
}
*/



//7.2. comparing multidimensional loop arrays with deepequals() method which outputs true or false
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr1[][]={{10,5},{20,15},{30,25},{60,55}};
       int arr2[][]={{10,5},{20,15},{30,25},{60,55}};
       boolean TorF=Arrays.deepEquals(arr1,arr2);
       if(TorF==true)
       System.out.println("The two arrays are equal");
       else
       System.out.println("The two arrays are not eaual");
  }
}
*/



//7.1.3 comparing an arrays values with compare() method which outputs 0,-1,1
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr1[]={1,2,3,4,5,6,7,8,9};
      int arr2[]={1,2,3,4,5,6,7,8,10};
      int result = Arrays.compare(arr1,arr2);
      if(result==0)
      System.out.println("Two Arrays are equal");
      else if(result == -1)
      System.out.println("Array1 is less than array2 so, Two Arrays are equal");  // 9<10
      else
      System.out.println("Array2 is less than array1 so, Two Arrays are equal");       
   }
}
*/




//7.1.3 comparing multidimensional arrays values with compare() method which outputs 0,-1,1
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
      int arr1[][]={{1,2},{3,4},{5,6},{7,8}};
      int arr2[][]={{1,2},{3,6},{5,6},{7,8}};
      int i,result;
      for(i=0;i<arr1.length;i++){
         result = Arrays.compare(arr1[i],arr2[i]);
         if(result!=0){
           System.out.println("Arrays at index " + i + " are not equal then result is : " + result);
           break;
         }
      }
      if(i==arr1.length)
      System.out.println("The two arrays are equal");   
   }
}
*/

        


//8.Add an element in an array
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr[]={1,2,3,4,5};
       arr=Arrays.copyOf(arr,arr.length+1);
       arr[arr.length-1]=6;
       System.out.println(Arrays.toString(arr));
   }
}
*/



//9.Add an element in an array with specified index
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr1[]={1,2,4,5,6};
       int insertElement = 3;
       int index=2;
       int arr2[]= new int[arr1.length+1];
       System.arraycopy(arr1,0,arr2,0,index);
       arr2[index]=insertElement;
       System.arraycopy(arr1,index,arr2,index+1,arr1.length-index);
       System.out.println(Arrays.toString(arr2));
   }
}
*/



//10.Remove an element in an array with specified index
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr1[]={1,2,3,7,4,5,6};
       int removeElement = 7;
       int index=3;
       int arr2[]= new int[arr1.length-1];
       System.arraycopy(arr1,0,arr2,0,index);
       System.arraycopy(arr1,index+1,arr2,index,arr1.length-index-1);
       System.out.println(Arrays.toString(arr2));
   }
}
*/



//11.Replace an element in an array with specified index
/*import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr1[]={1,2,3,4,6};
       int replaceElement = 5;
       int index=4;
       int arr2[]= new int[arr1.length];
       System.arraycopy(arr1,0,arr2,0,index);
       arr2[index]=replaceElement;
       System.out.println(Arrays.toString(arr2));
   }
}
*/


//                 OR 


import java.util.*;
class arraymethods{
   public static void main(String []args){
       int arr[]={1,2,3,4,6};
       int removeElement = 6;
       int replaceElement = 5;
       int index=4;
       int i;
       for(i=0;i<arr.length;i++){
         if(arr[i]==removeElement)
         {        
           arr[i]=replaceElement;
           break;
         }
       }   
       System.out.println(Arrays.toString(arr));
 
   }
}
              
       
       
      
      



