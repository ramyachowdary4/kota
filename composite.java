
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
				}
		}
		   if(c==2)
		   {
		   	System.out.println("no");
		   }
		   else
		   {
		   	System.out.println("yes");
		   }
	}
}
