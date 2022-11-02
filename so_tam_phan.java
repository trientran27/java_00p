
import java.util.Scanner;


public class so_tam_phan {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            String s= sc.next();
            int kt=1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='0' && s.charAt(i)!='1'&& s.charAt(i)!='2' ){
                    kt=0;
                    break;
                }
            }
            if(kt==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
    
}
