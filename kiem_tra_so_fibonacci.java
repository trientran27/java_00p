
import java.util.Scanner;


public class kiem_tra_so_fibonacci {
    static long[] a= new long[100];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        a[1]=0;
        a[2]=1;
        for(int i=3; i<=93; i++){
            a[i]=a[i-1]+a[i-2];
        }
        while(t!=0){
            long n= sc.nextLong();
            int kt=1;
            for(int i=1; i<=93; i++){
                if(a[i]==n){
                    System.out.println("YES");
                    kt=0;
                    break;
                }
            }
            if(kt==1){
                System.out.println("NO");
            }
            t--;
        }
    }
}
