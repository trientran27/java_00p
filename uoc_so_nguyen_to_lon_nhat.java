
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class uoc_so_nguyen_to_lon_nhat {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            long n=sc.nextLong();
            System.out.println(usnt(n));
            t--;
        }
    }
    public static long usnt(long n){
        long result=1;
        for(int i=2; i<=(int)sqrt(n); i++){
            if(n%i==0){
                while(n%i==0){
                    result=i;
                    n/=i;
                }
            }
        }
        if(n!=1) result=n;
        return result;
    }
}
