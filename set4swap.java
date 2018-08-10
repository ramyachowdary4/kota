import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   {
		a=a+b;
		b=a-b;
		a=a-b;
	   }
	      System.out.print(a+" ");
	      System.out.print(b);
	}
}
