
import java.util.Scanner;


public class quay_phai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long []a= new long[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextLong();
            }
            int k=0;
            for(int i=1; i<n; i++){
                if(a[i]<a[i-1]){
                    k=i;
                    break;
                }
            }
            System.out.println(k);
        }
    }
    
}
