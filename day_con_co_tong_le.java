
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class day_con_co_tong_le {
    
    static ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int k = sc.nextInt();
            Integer[] a = new Integer[20];
            int[] b = new int[20];

            for(int i = 1;i <= k; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1,k+1,Collections.reverseOrder());
            creat_binary(a,b,k,1);
          
            for(int i = 0;i < ar.size();i ++){
                for(int j = 0;j < ar.get(i).size();j ++)
                    System.out.print(ar.get(i).get(j)+" ");
                System.out.println();
            }
            ar.clear();
        }
        sc.close();
    }
    public static void creat_binary(Integer []a,int []b,int n,int j){
        for(int i = 0; i<= 1;i ++){
            b[j] = i;
            if(j == n) output(a,b,n);
            else creat_binary(a, b, n, j+1);
        }
    }

    public static void output(Integer []a,int []b,int n){
        long sum = 0;
        
        ArrayList<Integer>l= new ArrayList<>();
        for(int i = 1;i <= n;i ++){
            if(b[i] == 1){
                sum+= (Integer) a[i];
                l.add(a[i]);
            }
        }
        if(sum % 2 != 0)
            ar.add(l);
    }
}
