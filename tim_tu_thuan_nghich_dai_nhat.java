
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class tim_tu_thuan_nghich_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp= new LinkedHashMap<>();
        int tmp=0;
        while(sc.hasNext()){
            String s= sc.next();
            if(check(s)){
                if(s.length()>tmp){
                    mp.clear();
                    mp.put(s, 1);
                    tmp=s.length();
                }else if(s.length()==tmp){
                    if(mp.containsKey(s)){
                        mp.put(s, mp.get(s)+1);
                    }else{
                        mp.put(s, 1);
                    }
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = mp.entrySet();
        for(Map.Entry<String, Integer> it : entrySet){
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
