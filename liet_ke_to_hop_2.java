
import java.util.Scanner;


public class liet_ke_to_hop_2 {
    static int []a= new int[100];
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Try(1, n, k);
        System.out.println("");
        System.out.println("Tong cong co " + cnt+ " to hop");
    }
    public static void Try(int i, int n, int k){
        for(int j=a[i-1]+1; j<=n-k+i; j++){
            a[i]=j;
            if(i==k){
                cnt++;
                for(int l=1; l<=k; l++){
                    System.out.print(a[l]);
                }
                System.out.print(" ");
            }else Try(i+1, n, k);
        }
    }
}
