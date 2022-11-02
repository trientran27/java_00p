
import java.util.Scanner;


public class sap_xep_noi_bot {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int kt=1;
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    kt=0;
                }
            }
            if(kt==0){
                System.out.print("Buoc "+ (i+1)+ ": ");
                for(int j=0; j<n; j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
            }else break;
        }
    }
    
}
