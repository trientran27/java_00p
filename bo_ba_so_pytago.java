
import java.util.Arrays;
import java.util.Scanner;


public class bo_ba_so_pytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int[]a= new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int i=n-1;
            int kt=1;
            while(i>0){
                int l=0, r=i-1;
                while(l<r){
                    if(1l*a[l]*a[l]+1l*a[r]*a[r]==1l*a[i]*a[i]){
                        System.out.println("YES");
                        kt=0;
                        break;
                    }else if(1l*a[l]*a[l]+1l*a[r]*a[r]<1l*a[i]*a[i]){
                        l++;
                    }else{
                        r--;
                    }
                }
                if(kt==0) break;
                i--;
            }
            if(kt==1) System.out.println("NO");
        }
    }
    
}
