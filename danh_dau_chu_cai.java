
import java.util.Scanner;


public class danh_dau_chu_cai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int []a= new int[255];//do dai bang max aascii
        for(int i=0; i<s.length(); i++){
            a[s.charAt(i)]=1;
        }
        int cnt=0;
        for(int i=0; i<255; i++){
            if(a[i]==1) cnt++;
        }
        System.out.println(cnt);
    }
    
}
