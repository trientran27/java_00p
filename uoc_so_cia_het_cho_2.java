
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class uoc_so_cia_het_cho_2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            long a = sc.nextLong();
            System.out.println(uoc(a));
            t--;
        }
    }
    public static long uoc(long n){
        if(n<2) return 0;
        if(n==2) return 1;
        int sum=0;
        for(int i=2; i<=(int)sqrt(n); i++){
            if(n%i==0 ){
                if(i%2==0)sum++;
                if((n/i)%2==0 && i!=(n/i))sum++;
            }
        }
        if(n%2==0) sum++;
        return sum;
    }
}
