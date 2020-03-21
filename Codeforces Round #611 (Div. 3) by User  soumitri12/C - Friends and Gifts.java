
// 1283 C - Friends and Gifts.java Java 11
import java.util.*;
import java.math.BigInteger;
import java.io.*;
public class gifts
{
    public static void main(String[] args)  throws IOException
    {
        Scanner sc=new Scanner(System.in);
        PrintWriter write=new PrintWriter(System.out);
        int n=sc.nextInt();
        int f[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=sc.nextInt();
        }
        ArrayList<Integer> ngot=new ArrayList<Integer>();
        ArrayList<Integer> ngive=new ArrayList<Integer>();
        int a[]=new int[n];
        int notgot=0,notgive=0;
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=f[i];
        }
        for(int i=0;i<n;i++)
        {
            if(search(i+1,num)==false)
            {notgot++; ngot.add(i+1);}
           if(f[i]==0)
           {notgive++; ngive.add(i);}
        }
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(f[i]==0)
            {
                if((i)==(int)Integer.valueOf(ngive.get(k)))
                {
                    Collections.swap(ngot,k,k+1);
                }
                f[i]=(int)Integer.valueOf(ngot.get(k++));
            }
            
        }
        for(int v: f)
        write.print(v+" ");

        write.close();
    }
    static boolean search(int x, int a[])
    {
        Arrays.sort(a);
        int l=0,u=a.length-1,mid=0; boolean flag=false;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(x==a[mid])
            {
                flag=true; break;
            }
            else if (x>a[mid])
            l=mid+1;
            else u=mid-1;
        }
        return flag;
    }
}
1283 C - Friends and Gifts.java Java 11 Wrong answer on test 2
import java.util.*;
import java.math.BigInteger;
import java.io.*;
public class gifts
{
    public static void main(String[] args)  throws IOException
    {
        Scanner sc=new Scanner(System.in);
        PrintWriter write=new PrintWriter(System.out);
        int n=sc.nextInt();
        int f[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=sc.nextInt();
        }
        ArrayList<Integer> ngot=new ArrayList<Integer>();
        ArrayList<Integer> ngive=new ArrayList<Integer>();
        int a[]=new int[n];
        int notgot=0,notgive=0;
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=f[i];
        }
        for(int i=0;i<n;i++)
        {
            if(search(i+1,num)==false)
            {notgot++; ngot.add(i+1);}
           if(f[i]==0)
           {notgive++; ngive.add(i);}
        }
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(f[i]==0)
            {
                f[i]=(int)Integer.valueOf(ngot.get(k++));
            }
            
        }
        for(int v: f)
        write.print(v+" ");

        write.close();
    }
    static boolean search(int x, int a[])
    {
        Arrays.sort(a);
        int l=0,u=a.length-1,mid=0; boolean flag=false;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(x==a[mid])
            {
                flag=true; break;
            }
            else if (x>a[mid])
            l=mid+1;
            else u=mid-1;
        }
        return flag;
    }
}
1283 C - Friends and Gifts.java Java 11 Runtime error on test 1
import java.util.*;
import java.math.BigInteger;
import java.io.*;
public class candies // with multiple queries
{
    public static void main(String[] args)  throws IOException
    {
        Scanner sc=new Scanner(System.in);
        PrintWriter write=new PrintWriter(System.out);
        int t=sc.nextInt();
        for(int q=0;q<t;q++)
        {
            long n=sc.nextInt();
            long k=sc.nextInt();
            long rep=n%k;
            long eql=n-rep;
            long p=((k/2)<rep)?(k/2):rep;
            long ans=eql+p;
            write.println(ans);
        }
        write.close();
    }
}