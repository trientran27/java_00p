
import java.util.Scanner;


public class ma_tran_nhi_phan {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] a= new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                a[i][j]=scanner.nextInt();
            }
        }
        int ans=0;
        for(int i=0; i<n; i++){
            int dem=0;
            for(int j=0; j<3; j++){
                if(a[i][j]==1){
                    dem++;
                }
            }
            if(dem>=2){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
