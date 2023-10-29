import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Motivation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		
		while(t-- > 0)
		{
		    int n = read.nextInt();
		    int x = read.nextInt();
		    
		    int maxrating = -1 ;
		    
		    for (int i = 0; i < n; i++)
		    {
		        int spacerequired = read.nextInt();
		        int IMBDrating =  read.nextInt();
		        
		        if(spacerequired <= x && IMBDrating > maxrating)
		        {
		            maxrating = IMBDrating;
		        }
		    }
		    
		    System.out.println(maxrating);
		}
	}
}
