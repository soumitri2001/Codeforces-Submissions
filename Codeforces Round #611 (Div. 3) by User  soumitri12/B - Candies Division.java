
// 1283 B - Candies Division.java Java 11 Accepted
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