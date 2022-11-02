
import java.util.Arrays;
import java.util.Scanner;


public class day_con_co_k_phan_tu_tang_dan {
    static int n, k;
    static int []a= new int[20];
    static int []x= new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            k=sc.nextInt();
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i]>a[j]){
                        int tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
            }
            x[0]=-1;
            Try(1,0);
        }
    }
    public static void Try(int i, int pos){
        for(int j=pos; j<n; j++){
            if(a[j]>x[i-1]){
                x[i]=a[j];
                if(i==k){
                    for(int l=1; l<=k; l++){
                        System.out.print(x[l]+" ");
                    }
                    System.out.println();
                }
            }
            Try(i+1, j+1);
        }
    }
}
