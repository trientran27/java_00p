
import java.util.Scanner;



public class hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println("0");
        }else{
            System.out.println(((a+b)*2) +" "+(a*b));
        }  
    }
}
