
// 1294 C - Product of Three Numbers.java Java 11 Accepted
import java.util.*;
public class factors 
{
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while(t-->0) 
        {
			long n = sc.nextLong();
			long a = 0, b = 0;
            for(long i=2;i<=Math.sqrt(n);i++) 
            {
                if(n%i==0) 
                {
					n/=i;
                    if(a==0) 
                    {
						a=i;
					}
                    else 
                    {
						b=i;
						break;
					}
				}
			}
			if(a!=0 && b!=0 && n>b) 
            {
				System.out.println("YES");
				System.out.println(a+" "+b+" "+n);
			}
            else 
            {
				System.out.println("NO");
			}
		}
 
	}
}

1294 C - Product of Three Numbers.java Java 11 Wrong answer on test 2
import java.util.*;
import java.io.*;
import java.math.*; 

public class factors 
{ 
	// method to print the divisors 
    static long a[];
	static void printDivisors(long n) 
	{ 
        ArrayList<Long> al=new ArrayList();
		for (long i=2; i<=Math.sqrt(n); i++) 
		{ 
			if (n%i==0) 
			{ 
				// If divisors are equal, print only one 
				if (n/i == i) 
                    al.add(i);
				else // Otherwise print both 
				{
                    al.add(i);
                    al.add(n/i);
                }
			} 
		}
        Collections.sort(al);
         a=new long[al.size()];
         for(int i=0;i<a.length;i++)
         a[i]=al.get(i);
         int flag=0;
         for(int i=0;i<a.length-1;i++)
         {
            int pos=searchof(n/(a[i]*a[i+1]),i+1);
            if(pos>i+1)
            {
                flag=1;
                System.out.println("YES");
                System.out.println(a[i]+" "+a[i+1]+" "+a[pos]);
                break;
            }  
         }
         if(flag==0)
         System.out.println("NO");
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            printDivisors(n);
	    } 
    }
    static int searchof(long x,int pos)
    {
        int l=pos+1,u=a.length-1,mid=0,index=-1;;
        int flag=0;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(x==a[mid])
            {
                flag=1;
                index=mid;
                break;
            }
            else if(x>a[mid])
            l=mid+1;
            else u=mid-1;
        }
        if(flag==1)
        return index;
        else return -99;
    }
} 
