
import static java.lang.Math.abs;
import java.util.Scanner;


public class chia_het_cho11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s= sc.next();
            if(check(s)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
    public static boolean check(String s){
        int chan=0, le=0;
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                chan+= s.charAt(i)-'0';
            }else{
                le+= s.charAt(i)-'0';
            }
        }
        if(abs(chan-le)%11==0){
            return true;
        }
        return false;
    }
}
