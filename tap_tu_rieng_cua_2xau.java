
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class tap_tu_rieng_cua_2xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String x = sc.nextLine();
            String y = sc.nextLine();
            String[] a = x.split(" ");
            String[] b = y.split(" ");
            Set<String> set = new TreeSet<>();
            for(int i = 0; i < a.length; i++){
                set.add(a[i]);
            }
            for(String s : set){
                for(int i = 0; i < b.length; i++){
                    if(s.equals(b[i])){
                        break;
                    }
                    if(i == b.length - 1){
                        System.out.print(s + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
