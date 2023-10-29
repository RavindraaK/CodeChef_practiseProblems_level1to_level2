import java.util.*;
import java.lang.*;
import java.io.*;

class Richie_Rich
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    
		    int ans=(a-b)/c;
		    System.out.println(abs(ans));
		}
	}
	private static int abs(int ans)
	{
	    if(ans<0)
		{
			ans=-(ans);
		}
		return ans;
	}
}
