/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinh_sao;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Hinh_sao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
        for(int i=0; i<=n; i++){
            Vector<Integer> cmp = new Vector<>();
            v.add(cmp);
        }
        
        for(int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            v.elementAt(a).add(b);
            v.elementAt(b).add(a);
        }
        int kt=1;
        for(int i=0; i<v.size();i++){
            if(v.elementAt(i).size()==n-1){
                kt=0;
                System.out.println("Yes");
                break;
            }
        }
        if(kt==1) System.out.println("No");
    }
    
}
