/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiem_tra_day_ngoac_dung;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Kiem_tra_day_ngoac_dung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t --> 0)
        {
            String s = sc.next();
            if(kiemtra(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int kiemtra(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if( x==')'){
                if(st.empty() || st.peek()!='('){
                    return 0;
                }
                st.pop();//thoa man thi lay ra
            }
            else if( x==']'){
                if(st.empty() || st.peek()!='['){
                    return 0;
                }
                st.pop();//thoa man thi lay ra
            }
            else if( x=='}'){
                if(st.empty() || st.peek()!='{'){
                    return 0;
                }
                st.pop();//thoa man thi lay ra
            }else{
                st.push(x);
            }
        }
        return 1;
    }
}
