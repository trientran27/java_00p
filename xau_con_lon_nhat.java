
import java.util.Scanner;


public class xau_con_lon_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        int[] a= new int[200];
        for(int i=0; i<s.length(); i++){
            a[s.charAt(i)]++;
        }
        for(int i=0; i<s.length(); i++){
            int kt=1;
            for(int j=s.charAt(i)+1; j<200; j++){
                if(a[j]>0){
                    kt=0;
                    break;
                }
            }
            if(kt==1){//neu dang sau khong co ki tu lon hon
                res+=s.charAt(i);
                a[s.charAt(i)]--;
            }else{
                a[s.charAt(i)]--;
            }
        }
        System.out.println(res);
    }
    
}
