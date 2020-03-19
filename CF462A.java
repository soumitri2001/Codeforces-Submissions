import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF462A 
{
    static class FastReader {
        
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static class Node {
        
        long pp;
        long a, b;
        
        Node(long x, long y) {
            a = x;
            b = y;
            pp = a * b;
        }
    }
    
    static class Comp implements Comparator<Node> {
        
        public int compare(Node o1, Node o2) {
            if (o1.pp > o2.pp) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            String in=sc.next();
            a[i]=in.trim().toCharArray();
        }
        if(n==1)
        {
            System.out.println("YES");
            return;
        }
        int ctr=0,i=0;
        for(i=0;i<n;i++)
        {
            //flag=1;
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0)
				{
					if(a[i][j+1]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
				}
				else if(i==0&&j==n-1)
				{
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
				}
				else if(i==n-1&&j==0)
				{
					if(a[i][j+1]=='o')
						++ctr;
					if(a[i-1][j]=='o')
						++ctr;
				}
				else if(i==n-1&&j==n-1)
				{
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i-1][j]=='o')
						++ctr;
				}
				else if(i==0&&j!=0)
				{
					if(a[i][j+1]=='o')
						++ctr;
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
				}
				else if(i==n-1&&j!=n-1)
				{
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i][j+1]=='o')
						++ctr;
					if(a[i-1][j]=='o')
						++ctr;
				}
				else if(j==n-1&&i!=n-1)
				{
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
					if(a[i-1][j]=='o')
						++ctr;
				}
				else if(j==0&&i!=0)
				{
					if(a[i-1][j]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
					if(a[i][j+1]=='o')
						++ctr;
				}
				else
				{
					if(a[i][j-1]=='o')
						++ctr;
					if(a[i+1][j]=='o')
						++ctr;
					if(a[i][j+1]=='o')
						++ctr;
					if(a[i-1][j]=='o')
						++ctr;
				}
				if(ctr%2!=0)
					break;
			}
			if(ctr%2!=0)
				break;
			ctr=0;
        }
        if(i>=n)
        System.out.println("YES");
        else System.out.println("NO");
    }
}
