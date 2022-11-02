
import java.util.Scanner;


public class dem_so_lan_xuat_hien {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int x=1; x<=t; x++){
            int n= sc.nextInt();
            int[]a= new int[n];
            int[] b= new int[100000];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test "+ x +":");
            for(int i=0; i<n; i++){
                if(b[a[i]]>0){
                    System.out.println(a[i] + " xuat hien " + b[a[i]]+" lan");
                    b[a[i]]=0;
                }
            }
        }
    }
}
