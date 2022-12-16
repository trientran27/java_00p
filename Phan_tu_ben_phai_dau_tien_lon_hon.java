/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phan_tu_ben_phai_dau_tien_lon_hon;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Phan_tu_ben_phai_dau_tien_lon_hon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] M = new int[n];
            for (int i = 0; i < n; i++) M[i] = scan.nextInt();
            for(int i=0;i<n;i++){
               int x=0;
               for(int j=i;j<n;j++){
                   if(M[j]>M[i]) {
                       System.out.printf(M[j] + " ");
                       x = 1;
                       break;
                   }
               }
                if(x==0) System.out.print("-1 ");
            }
            System.out.println();
        }
    }
    
}
