import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Smallest_Possible_Whole_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		
		while(t-- > 0)
		{
		    int n = read.nextInt();
		    int k = read.nextInt();
		    
		    if( k == 0)
		    {
		        System.out.println(n);
		    }
		    else{
		        System.out.println(n % k);
		    }
		    
		}
	}
}
