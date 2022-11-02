
import java.util.Scanner;


public class tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long sum=0;
        for(int i=1; i<=n; i++){
            sum+=gt(i);
        }
        System.out.println(sum);
    }
    public static long gt(int n){
        long tich=1;
        for(int i=1; i<=n; i++){
            tich*=i;
        }
        return tich;
    }
}
