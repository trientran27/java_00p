
import static java.lang.Math.max;
import java.util.Scanner;


public class bo_xung_day_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a = new int[100];
        int[]b = new int[500];
        int max=0;
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            b[a[i]]=1;
            max= max(a[i], max);
        }
        int kt=1;
        for(int i=1; i<=max; i++){
            if(b[i]!=1){
                System.out.println(i);
                kt=0;
            }
        }
        if(kt==1){
            System.out.println("Excellent!");
        }
    }
    
}
