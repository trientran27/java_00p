
import java.util.Scanner;


public class danh_sach_canh {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] a= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]=scanner.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][j]==1 && j>i){
                    System.out.println("(" +(i+1)+ "," +(j+1)+")");
                }
            }
        }
    }
    
}
