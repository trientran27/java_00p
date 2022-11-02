
import java.util.Scanner;


public class phan_tich_thua_so_nt {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++){
            int n= sc.nextInt();
            System.out.print("Test " + (i+1) + ": ");
            int cnt=0;
            while( n%2==0){
                n/=2;
                cnt++;
            }
            if(cnt>0){
                System.out.print("2(" + cnt +")");
                cnt=0;
            }
            for(int j=3; j<=n; j+=2){
                if(n<=0) break;
                while(n>0 && n%j==0){
                    n/=j;
                    cnt++;
                }
                if(cnt>0){
                    System.out.print(" " + j + "(" + cnt +")");
                    cnt=0;
                }
            }
            System.out.println();
        }
    }
    
}
