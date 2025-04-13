
// 1.To find a length of a string by using - stringname.length()

/*class stringmethods{
    public static void main(String args[]){
       String str="tarun kumar";
       System.out.println(str.length());
    }
}
*/

// 2.Find a character in string through index - stringname.charAt(indexvalue))
/*
   
class stringmethods{
    public static void main(String args[]){
       String str="tarun kumar";
       System.out.println(str.charAt(6));
    }
}    
*/


// 3.Return a substring from the specified index - stringname.substring(indexvalue))
/*
class stringmethods{
    public static void main(String args[]){
       String str="tarun kumar";
       System.out.println(str.substring(6));
    }
}    
*/

// 4.Return a substring between the specified index - stringname.substring(startindexvalue,endindexvalue));
/*

class stringmethods{
    public static void main(String args[]){
       String str="tarun kumar";
       System.out.println(str.substring(0,11));
    }
}   
*/


// 5.Comparing two strings if same return true else false - str1.equals(str2)
/* 

class stringmethods{
   public static void main(String []args){
      String str1="tarun";
      String str2="Tarun";
      System.out.println(str1.equals(str2)); // false
   }
}
*/

// 6.Comparing two strings with ignore case sensitive if same return true else false - str1.equalsIgnoreCase(str2)
/*

class stringmethods{
   public static void main(String []args){
      String str1="tarun";
      String str2="Tarun";
      System.out.println(str1.equalsIgnoreCase(str2)); // true
   }
}
*/

// 7.convert a string into all uppercase or lowercase letters - stringname.toUpperCase() and stringname.toLowerCase())
/*
           

class stringmethods{
   public static void main(String []args){
      String str1="TARUN";
      String str2="tarun";
      System.out.println(str1.toLowerCase()); // tarun
      System.out.println(str2.toUpperCase()); // TARUN
   }
}
*/

// 8.Remove the whitespace starting and ending of a string - stringname.trim()
/*
class stringmethods{
   public static void main(String []args){
      String str1="  * TARUN *  ";
      System.out.println(str1.trim()); //* TARUN *

   }
}

*/

// 9.Replace a char - stringname.replace('old','new')
/*
class stringmethods{
   public static void main(String []args){
      String str1="TaRUN";
      System.out.println(str1.replace('a','A'));

   }
}
*/

// 10.Replace a string - stringname.replace("old","new")
/*
class stringmethods{
   public static void main(String []args){
      String str1="TARUN";
      System.out.println(str1.replace("TARUN","KODIGANTI THARUN KUMAR")); //KODIGANTI THARUN KUMAR

   }
}
*/

// 10.1. Replace a string - stringname.replaceAll("//regexp","newregexp")
// d is a regex which consists of a number from 0 to 9
/*

class stringmethods{
   public static void main(String []args){
      String str1="TARUN123KUMAR456KODIGANTI";
      System.out.println(str1.replaceAll("\\d"," ")); //THARUN   KUMAR   KODIGANTI

   }
}
*/ 

// 10.2. Replace a string at first - stringname.replaceFirst("//regexp","newregexp")

/*
class stringmethods{
   public static void main(String []args){
      String str1="1ARUN KUMAR KODIGANTI";
      System.out.println(str1.replaceFirst("\\d","T")); //THARUN KUMAR KODIGANTI

   }
}
*/

// 11.Checks if the string contains a specific sequence - stringname.contains("check string")
/*
class stringmethods{
    public static void main(String []args){
        String str="kodiganti tharun kumar";
        System.out.println(str.contains("tharun kumar")); //true
    }
}
*/

// 12.Returns the index of the first or last occurrence of a substring - stringname.indexOf('char') & stringname.lastIndexOf('char')
/*
class stringmethods{
    public static void main(String []args){
        String str="kodiganti tharun kumar";
        System.out.println(str.indexOf('i')); //from left side of string where i is there - 3
        System.out.println(str.lastIndexOf('i')); //from right side of string where i is there - 8
    }
}
*/

// 13.Checks if the string starts or ends with a specific substring - stringname.startsWith("string") & stringname.endsWith("string")
/*
class stringmethods{
    public static void main(String args[]){
         String str="santhiram engineering college";
         System.out.println(str.startsWith("san"));//true
         System.out.println(str.endsWith("llege"));//true
    }
}
*/


// 14.Splits the string into an array based on a regular expression - stringname.split(",")
/*
class stringmethods{
     public static void main(String []args){
         String str="apple,banana,orange";
         String arr[]=str.split(",");
         for(String fruit : arr){
             System.out.println(fruit);
         }
     }
}
*/

// output
// apple
// banana
// orange


// 15.Checks if the string is empty or blank - stringname.isEmpty() or stringname.isBlank()
/*
class stringmethods{
      public static void main(String args[]){
            String str1="";
            String str2="       ";
            System.out.println(str1.isEmpty());  //true
            System.out.println(str2.isBlank());  //true
      }
}
*/
// 16.Converts primitive data types to string - stringname.valueOf(variablename)
/*
class stringmethods{
      public static void main(String args[]){
            int age = 25;
            String str ="";
            System.out.println(str.valueOf(age)); // 25
      }
}
*/

// 17.Concat of two strings - str1.concat(str2)
/*
class stringmethods{
      public static void main(String args[]){
            String str1="THARUN";
            String str2="KUMAR";
            System.out.println(str1.concat(str2));  //THARUNKUMAR
      }
}
*/

// 18. Comparing two strings at a time one char compare with another char of sec string - str1.compareTo(str2) 
// diffence between equals and compare is equals returns true if same else false.
//compareto checks each index value at same time of two strings if its not same then it returns index value of where not same.
/*

class stringmethods{
      public static void main(String args[]){
            String str1="THARUN";
            String str2="THARUN";
            System.out.println(str1.compareTo(str2));  //0
      }
}
*/


// 19. Comparing two strings at a time one char compare with another char of sec string with case insensitive - str1.compareToIgnoreCase(str2)
/*

class stringmethods{
      public static void main(String args[]){
            String str1="THARUN";
            String str2="tHarun";
            System.out.println(str1.compareToIgnoreCase(str2));  //0
      }
}
*/

// 20.Converting a string to a char array - stringname.toCharArray()
/*
class stringmethods{
      public static void main(String args[]){
            String str="THARUN";
            char char1[]=str.toCharArray();
            System.out.println(char1[0]);  //T
            System.out.println(char1[5]);  //N
            System.out.println(char1);     //THARUN
      }
}
*/


// 21. Returns a formatted string using placeholders and arguments - stringname.format("format string",arguments...)
/*

class stringmethods{
      public static void main(String args[]){
          String name = "TARUN KUMAR";
          int age=21;
          String result = String.format(" MY NAME IS %s AND I'M %d YEARS OLD ",name,age);
          System.out.println(result);
     }
}
*/

// 22. When you have many strings with same value - stringname.intern()
// intern() works the already existing string from the pool if it's there - or put it in the pool if it's not , this causes to save memory

class stringmethods{
      public static void main(String args[]){
          String str1 =new String("TARUN KUMAR"); //creates string object with memory
          String str2 = "TARUN KUMAR"; //both are consisting same values with differ variable
          System.out.println(str1.intern() == str2); //true
          System.out.println(str1 == str2);          //false
     }
}





















