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
          int m=sc.nextInt();
          
	      //System.out.println("Printing Even numbers between intervals  " + n);
		  for(int i=n;i < m;i++)
		  {
		  if(i>n&&i<m)
		  {
		    if( i % 2 == 0)
		  {
		  	
		    System.out.print(i + " ");
		  }
		 }
		  }
	}
}
