

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Spells
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		
		while(t-- > 0)
		{
		    int a = read.nextInt();
		    int b = read.nextInt();
		    int c = read.nextInt();
		    
		    int x = a+b;
		    int y = b+c;
		    int z = a+c;
		    
		    if(x >= y && x >= z)
		    {
		        System.out.println(x);
		    }
		    else if(y >= z && y >= x)
		    {
		        System.out.println(y);
		    }
		    else if(x==y && x==z && z==y)
		    {
		        System.out.println(z);
		    }
		    else if(z >= x && z >= y)
		    {
		        System.out.println(z);
		    }
		    
		}
	}
}
