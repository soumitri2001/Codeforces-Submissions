
//1294 A - Collecting Coins.java Java 11 Accepted
import java.util.*;
public class coins
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long n=sc.nextLong();
            long tot=a+b+c+n;
            if(tot%3==0)
            {
                if((tot/3)>=a && (tot/3)>=b && (tot/3)>=c)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
            else
            System.out.println("NO");
        }
    }
}
1294 A - Collecting Coins.java Java 11 Wrong answer on test 2
import java.util.*;
public class coins
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long n=sc.nextLong();
            long tot=a+b+c+n;
            if(tot%3==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}