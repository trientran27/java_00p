
import java.util.Scanner;

public class chu_so4_va_chu_so7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='4' || s.charAt(i)=='7'){
                sum++;
            }
        }
        if(sum==4 || sum==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
