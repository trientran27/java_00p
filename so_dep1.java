
import java.util.Scanner;




public class so_dep1 {

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
    public static boolean check(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(s.length() - i - 1) != s.charAt(i) || (s.charAt(i) - '0') % 2 == 1 ){
                return false;
            }
        }
        return (s.charAt(s.length() / 2) - '0') % 2 == 0;
    }
    
}
