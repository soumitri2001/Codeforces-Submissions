
// 1283 A - Minutes Before the New Year.java Java 11 Accepted
import java.util.*;
import java.math.BigInteger;
import java.io.*;
public class newyr // with multiple queries
{
    public static void main(String[] args)  throws IOException
    {
        Scanner sc=new Scanner(System.in);
        PrintWriter write=new PrintWriter(System.out);
        int t=sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int h=sc.nextInt();
            int m=sc.nextInt();
            int res=1440-((60*h)+m);
            write.println(res);
        }
        write.close();
    }
}