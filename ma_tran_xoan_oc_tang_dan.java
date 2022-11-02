
import java.util.Arrays;
import java.util.Scanner;


public class ma_tran_xoan_oc_tang_dan {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int n=t*t;
        int arr[]= new int[n];
        for(int i=0; i<n; ++i){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int a[][]=new int[t][t];
        int hang=t;
        int cot=t;
        int dem=0;
        int id=0;
        while(dem<=t/2){
            for(int i=dem; i<cot;++i){
                a[dem][i]=arr[id];
                id++;
                if(id>=n) break;
            }
            for(int i=dem+1;i<hang;++i){
                a[i][cot-1]=arr[id];
                id++;
                if(id>=n) break;
            }
            for(int i=cot-2; i>=dem; --i){
                a[hang-1][i]=arr[id];
                id++;
                if(id>=n) break;
            }
            for(int i= hang-2; i>dem; --i){
                a[i][dem]=arr[id];
                id++;
                if(id>=n) break;
            }
            dem++;
            hang--;
            cot--;
        }
        for(int i=0; i<t; ++i){
            for(int j=0; j<t; ++j){
                System.out.print(a[i][j]+" ");
            }
                System.out.println("");
        }
    }
    
}
