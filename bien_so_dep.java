
import java.util.Scanner;


public class bien_so_dep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        char x = s.charAt(5), y = s.charAt(6), z = s.charAt(7), t = s.charAt(9), o = s.charAt(10);
        if(x == y && y == z && z == t && t == o)//th 2
            return true;
        if(x == y && y == z && t == o)//th3
            return true;
        if(x == y - 1 && y == z - 1 && z == t - 1 && t ==  o -1)//th1
            return true;
        for(int i = 5; i <= s.length(); i++){//th4
            if(i == 8)
                continue;
            if(i == s.length())
                return true;
            if(s.charAt(i) != '6' && s.charAt(i) != '8')
                break;
        }
        return false;
    }
}
