
import java.util.Scanner;


public class day_uu_the {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            String[] x= s.split(" ");
            int []a= new int[x.length];
            for(int i=0; i<x.length; i++){
                a[i]= Integer.parseInt(x[i]);
            }
            if (check(a, a.length)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(int a[], int n){
        int chan=0, le=0;
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                chan++;
            }else{
                le++;
            }
        }
        if((n%2==0 && chan>le) || (n%2==1 && chan<le)){
            return true;
        }
        return false;
    }
}
