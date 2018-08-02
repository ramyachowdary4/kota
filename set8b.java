import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(num>m&&num<n)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
