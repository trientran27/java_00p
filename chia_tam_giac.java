import static java.lang.Math.sqrt;
import java.util.Scanner;


public class chia_tam_giac {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            int n= sc.nextInt();
            int h= sc.nextInt();
            for(int i=1; i<=n-1; i++){
                double da=h*sqrt((double)i/n);
                System.out.format("%.6f ", da );
            }
            System.out.println();
            t--;
        }
    }
}
