
import java.util.Scanner;

public class tinh_so_fibonacci {
    
    static long[] a= new long[100];
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        a[1]=1;
        a[2]=1;
        for(int i=3; i<=93; i++){
            a[i]=a[i-1]+a[i-2];
        }
        while(t!=0){
            int n= sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
    }
}
