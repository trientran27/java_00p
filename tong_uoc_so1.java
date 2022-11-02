
import java.util.Scanner;


public class tong_uoc_so1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[2000001];
        for (int i = 1; i < 2000001; i++)
            a[i] = (long) i;
        for (int i = 2; i < 2000001; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    a[i] = a[j] + a[i / j];
                    break;
                }
            }
        }
        int t = sc.nextInt();
        long tong=0;
        while(t-- > 0){
            int n= sc.nextInt();
            tong+=a[n];
        }
        System.out.println(tong);
    }
    
}
