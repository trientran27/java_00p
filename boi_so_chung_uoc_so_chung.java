
import java.util.Scanner;


public class boi_so_chung_uoc_so_chung {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println((a*b)/ucln(a,b)+" "+ucln(a,b));
            t--;
        }
    }
    public static long ucln(long a, long b){
        if(b==0) return a;
         return ucln(b, a%b);
    }
}
