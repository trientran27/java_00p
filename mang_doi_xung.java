
import java.util.Scanner;


public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] a= new int[100];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            int kt=1;
            for(int i=0; i<=n/2; i++){
                if(a[i]!=a[n-i-1]){
                    kt=0;
                    break;
                }
            }
            if(kt==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
