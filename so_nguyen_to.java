
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class so_nguyen_to {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            int n= sc.nextInt();
            if(nt(n)==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    
    public static int nt(int n){
        if(n<2) return 0;
        for(int i=2; i<=(int)sqrt(n); i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
}
