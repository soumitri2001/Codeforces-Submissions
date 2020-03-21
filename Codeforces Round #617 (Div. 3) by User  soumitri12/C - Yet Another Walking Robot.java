
// 1296 C - Yet Another Walking Robot.java Java 11 Accepted
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class  walkbot
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
    static class Pair
    {
        int x,y;
        Pair(int xx,int yy)
        {
            x=xx;
            y=yy;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            HashMap<String,Integer> hm = new HashMap<>();
			int x = 0, y = 0,  l = n+1, m = 0; 
			hm.put(x + "," + y, 0);
			for(int j=0; j<s.length(); j++){
				char ch = s.charAt(j);
				switch (ch){
					case 'L': x--; break;
					case 'R': x++; break;
					case 'U': y++; break;
					case 'D': y--; break;
				}
				String pt = x + "," + y;
				if(hm.containsKey(pt)){
					int cl = j - hm.get(pt);
					if(cl < l){
						l = cl; 
						m = j+1;
					}
					hm.replace(pt, j+1);
				}       
				else 	hm.put(pt, j+1);
			}
			if(l == n+1)	System.out.println("-1");
			else 	System.out.println(m-l + " " + m);
           
            /* int l=-1,r=n;
            HashMap<Pair,Integer> hm=new HashMap<>();
            Pair pt=new Pair(0,0);
            hm.put(pt,0);
            l=n+1; int m=0;
            for(int k=0;k<n;k++)
            {
                char x=route.charAt(k);
                switch(x)
                {
                    case 'L' : --pt.x; break;
                    case 'R' : ++pt.x; break;
                    case 'U' : ++pt.y; break;
                    case 'D' : --pt.y; break;
                }
                //pt=new Pair(pt.x,pt.y);
                // System.out.println("cur pt: "+pt.x+","+pt.y);
                if(hm.containsKey(pt))
                {
                    //System.out.println("cur pt: "+pt.x+","+pt.y);
                    // if(k-hm.get(pt)<r-l)
                    // {
                    //     l=hm.get(pt);
                    //     r=k;
                    // }
                    int ind=k-hm.get(pt);
					if(ind<l){
						l=ind; 
						m=k+1;
					}

                    hm.replace(pt,k+1);
                }
                hm.put(pt,k+1);
            }
            if(l==n+1)
            System.out.println("-1");
            else System.out.println((m-l)+" "+m); */
        }
    }
}

1296 C - Yet Another Walking Robot.java Java 11 Wrong answer on test 1
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class  walkbot
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int dp[][]=new int[2*n+1][2*n+1];
            dp[n][n]=1;
            String route=sc.next();
            int i=n,j=n;
            int l=-1,r=n;
            for(int k=0;k<route.length();k++)
            {
                char x=route.charAt(k);
                switch(x)
                {
                    case 'L' : dp[i--][j]++; break;
                    case 'R' : dp[i++][j]++; break;
                    case 'U' : dp[i][j++]++; break;
                    case 'D' : dp[i][j--]++; break;
                }
            }
            if(dp[i][j]>=1)
            {
                if(i-dp[i][j]<r-l+1)
                {
                    l=dp[i][j];
                    r=i;
                }
            }
            if(l==-1)
            System.out.println("-1");
            else System.out.println(l+" "+(r+1));
        }
    }
}
