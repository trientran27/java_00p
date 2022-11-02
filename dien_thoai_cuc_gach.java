
import java.util.Scanner;


public class dien_thoai_cuc_gach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[]a= new int[200];
        int tmp=2;
        for(int i=65; i<=90; i+=3){
            a[i]=a[i+1]=a[i+2]=tmp;
            if(tmp==7 || tmp==9){
                a[i+3]= tmp;
                i+=1;
            }
            tmp++;
        }
        while(t-->0){
            String s= (sc.next()).toUpperCase();
            int kt=1;
            for(int i=0; i<s.length()/2; i++){
                if(a[(int)s.charAt(i)]!=a[(int)s.charAt(s.length()-i-1)]){
                    System.out.println("NO");
                    kt=0;
                    break;
                }
            }
            if(kt==1) System.out.println("YES");
        }
    }
    
}
