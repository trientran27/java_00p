
import java.util.Scanner;
public class sap_xep_chon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            int idx = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[idx]){
                    idx = j;
                }
            }
            int tmp = a[idx];
            a[idx] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
    }
        
    }
    
}
