import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class D
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
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt(), flag = 1;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (i != 0) {
                    if (arr[i] != arr[0])
                        flag = 0;
                }
            }
            if (flag == 1) {
                out.println(1);
                for (int i = 0; i < N; i++) out.print(1 + " ");
                out.println();
                continue;
            }
            if (N%2==0) {
                out.println(2);
                for (int i = 0; i < N; i++){
                    if(i%2==0)
                        out.print(1 + " ");
                    else
                        out.print(2 + " ");
 
                }
                out.println();
                continue;
            }
            int index=-1;
            for(int i =0;i<N;i++){
                if(arr[i]==arr[(i+1 )%N]){
                    index=i;
                    break;
                }
            }
            if(index==-1){
                out.println(3);
                for (int i = 0; i < N-1; i++){
                    if(i%2==0)
                        out.print(1 + " ");
                    else
                        out.print(2 + " ");
 
                }
                out.println(3);
            }
            else
            {
                out.println(2);
                int a[]=new int[N]; int j=0;
                for(int i =0;i<N;i++) {
                    if (i == index + 1)
                        continue;
 
                    if (j % 2 == 0)
                        a[i] = 1;
                    else
                        a[i] = 2;
 
                    if(i==index){
                        a[(i+1)%N]=a[i];
                    }
                    j++;
                }
                for (int i = 0; i < N; i++)
                    out.print(a[i] + " ");
                out.println();
            }
        }

        out.close();
    }
}
