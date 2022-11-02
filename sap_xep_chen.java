
import java.util.Scanner;


public class sap_xep_chen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(a[j] > a[i]){
                    int tmp = a[i];
                    for(int k = i; k > j; k--){
                        a[k] = a[k - 1];
                    }
                    a[j] = tmp;
                    break;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
    
}
