
import java.math.BigInteger;
import java.util.Scanner;


public class so_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.next();
            int chan=0;
            int le=0;
            int kt=1;
            for(int i=0; i<a.length(); i++){
                if((a.charAt(i)-'0')<0 || (a.charAt(i)-'0')>9){
                    System.out.println("INVALID");
                    kt=0;
                    break;
                }
                if((a.charAt(i)-'0')%2==0) chan++;
                else le++;
            }
            if(kt==1){
                if((a.length()%2==0 && chan>le) || (a.length()%2==1 && le>chan)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
    
}
