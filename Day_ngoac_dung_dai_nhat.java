/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day_ngoac_dung_dai_nhat;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Day_ngoac_dung_dai_nhat {
    public static int max_day(String s){
        Stack<Integer> S=new Stack<>();
        S.push(-1);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')S.push(i);
            else {
                S.pop();
                if(S.size()>0)
                    res=Math.max(res,i-S.peek());
                if(S.size()==0)S.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            System.out.println(max_day(s));
        }
    }
}
