
import java.util.Scanner;


public class so_dep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean nt(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(s.length() - i - 1) != s.charAt(i) || nt(s.charAt(i)-'0')==false){
                return false;
            }
        }
        return true;
    }
}
