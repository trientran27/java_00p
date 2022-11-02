
import static java.lang.Math.abs;
import java.util.Scanner;


public class so_xa_cach {
    static int []a= new int[100];
    static Boolean[] used = new Boolean[100];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            for(int i = 0; i < 10; i++){
                used[i] = false;
            }
            int n = sc.nextInt();
            Try(1,n);
        }
    }
    public static Boolean check(int n){
        for(int i=2; i<=n; i++){
            if(abs(a[i]-a[i-1])==1){
                return false;
            }
        }
        return true;
    }
    public static void Try(int i, int n){
        for(int j=1; j<=n; j++){
            if(used[j]==false){
                a[i]=j;
                used[j]=true;
                if(i==n && check(n)){
                    for(int k = 1; k <= n; k++){
                        System.out.print(a[k]);
                    }
                    System.out.println("");
                }else Try(i+1, n);
                used[j]=false;
            }
        }
    }
}
