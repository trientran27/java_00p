
import java.util.Scanner;


public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        if (a==0){
            if(b==0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            double da= -b/a;
            System.out.format("%.2f", da);
        }
    }
}

