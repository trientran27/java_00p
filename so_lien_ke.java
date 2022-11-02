
import static java.lang.Math.abs;
import java.util.Scanner;

public class so_lien_ke {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            String s= sc.next();
            int kt=1;
            for(int i=0; i<s.length()-1; i++){
                if(abs((int)s.charAt(i)- (int)s.charAt(i+1))!=1){
                    kt=0;
                    break;
                }
            }
            if(kt==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    
}
