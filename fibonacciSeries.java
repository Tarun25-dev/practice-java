import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+""+b);
		for(int i=0;i<num-2;i++){
		    int c=a+b;
		    a=b;
		    b=c;
		    System.out.print(c);
		}
	}
}
