
import java.util.Scanner;


public class xau_nhi_phan {
    static long[] g= new long[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        //g la do dai cua xau
        g[1]=1;
        g[2]=1;
        for(int i=3; i<=92; i++){
            g[i]=g[i-2]+g[i-1];
        }
        while(t-->0){
            int n= sc.nextInt();
            long k= sc.nextLong();
            System.out.println(kq(n,k));
        }
    }
    public static long kq(int n, long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k <= g[n-2]) return kq(n-2, k);
        return kq(n-1, k-g[n-2]);
    }
}
