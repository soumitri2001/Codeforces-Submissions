import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class B
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
    static int gcd(int x, int y)
    {
        if(y==0) return x;
        else return gcd(y,x%y);
    } 
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
		//your code starts here
		int t=sc.nextInt(); 
		while(t-->0) {
		int n=sc.nextInt();
		long k=sc.nextLong();
		long ctr=1l; int j=n; // out.println(ctr+" positions "+i+" "+j);
		/* while(true) {
			j=n;
			while(j!=i+1) 
			{
				--j;
				++ctr; // out.println(ctr+" positions "+i+" "+j);
				if(ctr==k) break;
			}
			if(ctr==k) break;
			--i; j=n; ++ctr; if(ctr==k) break;
			
		} */ 
        int prf[]=new int[n*2]; prf[0]=1;
        for(int i=1;i<prf.length;i++) prf[i]=i+1+prf[i-1];
        for(int i=0;i<n-1;i++)
        {
            if(prf[i+1]>k && prf[i]>=k) 
            {
                j=i+1; break;
            }
        }
        int i=j; j= (int)(j-1-(prf[j-1]-k));
        String str="";
        for(int c=0;c<n;c++) {
            if(c==i || c==j) str+='b';
            else str+='a';
        }
        for(int c=n-1;c>=0;c--) out.print(str.charAt(c));
        out.println();
	}

        out.close();
    }
}
