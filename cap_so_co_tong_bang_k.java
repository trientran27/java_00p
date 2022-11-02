
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t!=0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            TreeMap<Integer,Integer> mp = new TreeMap<>();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
                //put phan tu a[i] vao neu phan tu co trong thi cong len 1 con khong thi tra ve 0
                mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            }
            long res=0;
            for(int i = 0; i < n; i++) {
                //tra ve so phan tu thoa man neu khong co tra ve 0
                res += mp.getOrDefault(k-a[i],0);
                if(a[i]*2==k) res--;//tru di chinh no
            }
            System.out.println(res/2);//tru di ptu lap lai
            t--;
        }
    }
}

