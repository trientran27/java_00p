/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_0_va_so_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class So_0_va_so_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0){
            int n = input.nextInt();
            List<String> list = new ArrayList<>();
            list.add(Integer.toString(9));
            while(true){
                int tmp = Integer.parseInt(list.get(0));
                if (tmp % n == 0){
                    System.out.println(tmp);
                    break;
                }
                String s = list.get(0) + Integer.toString(0);
                String s1 = list.get(0) + Integer.toString(9);
                list.add(s);
                list.add(s1);
                list.remove(0);
            }
            t -= 1;
        }
    }
    
}