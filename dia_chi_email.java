
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class dia_chi_email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        String[] x = new String[n];
        for(int k = 0; k < n; k++){
            String s = sc.nextLine().toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            String res = "";
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                if(!st.hasMoreTokens()){//neu la ten
                    res = token + res;
                }
                else{
                    res = res + token.charAt(0);//ho ten dem
                }
            }
            x[k] = res;
        }
        for(int i = 0; i < n; i++){
            if(!map.containsKey(x[i])){
                System.out.println(x[i] + "@ptit.edu.vn");
                map.put(x[i], 1);
            }
            else{
                int tmp = map.get(x[i]);
                map.put(x[i], tmp + 1);
                System.out.println(x[i] + (tmp + 1) + "@ptit.edu.vn");
            }
        }
    }
    
}
