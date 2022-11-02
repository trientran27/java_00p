
import java.util.Scanner;


public class diem_can_bang {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a= new int[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            for(int i=1; i<n; i++){
                a[i]+= a[i-1];
            }
            int kt=1;
            for(int i=1; i<n-1; i++){
                if(a[i-1]==a[n-1]-a[i]){
                    System.out.println(i+1);
                    kt=0;
                    break;
                }
            }
            if(kt==1) System.out.println("-1");
        }
    }
    
}
