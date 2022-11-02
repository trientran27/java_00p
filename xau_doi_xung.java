
import java.math.BigInteger;
import java.util.Scanner;


public class xau_doi_xung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.next();
            int tmp=0;
            for(int i=0; i<a.length()/2; i++){
                if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                    tmp++;
                }
            }
            if(tmp==1 || (tmp==0 && a.length()%2==1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
