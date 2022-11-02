
import java.util.Scanner;


public class lua_chon_tham_lam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if(n*9<s || (n==0 && s>0) || (n>0 && s==0)){
            System.out.println("-1 -1");
        }else{
            int[]lon= new int[n];
            int[]be= new int[n];
            int tmp=s-1;
            //tim so lon
            for(int i=0; i<n; i++){
                if(s>=9){
                    lon[i]=9;
                    s-=9;
                }else if(s!=0){
                    lon[i]=s;
                    s=0;
                }else break;
            }
            //tim so be
            for(int i=n-1; i>0; i--){
                if(tmp>=9){
                    be[i]=9;
                    tmp-=9;
                }else if(tmp!=0){
                    be[i]=tmp;
                    tmp=0;
                }else break;
            }
            be[0]=tmp+1;
            for(int i=0; i<n; i++){
                System.out.print(be[i]);
            }
            System.out.print(" ");
            for(int i=0; i<n; i++){
                System.out.print(lon[i]);
            }
        }
    }
}
