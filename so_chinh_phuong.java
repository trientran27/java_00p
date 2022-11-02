
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class so_chinh_phuong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            long a = sc.nextLong();
            if((int)sqrt(a)*(int)sqrt(a) == a){
                System.out.println("YES"); 
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    
}
