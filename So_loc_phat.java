/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_loc_phat;

import java.util.*;

/**
 *
 * @author Admin
 */
public class So_loc_phat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<String> l=new ArrayList<>();
            Queue<String> q=new ArrayDeque<>();
            long soCuoi=(long)(Math.pow(10,n));
            q.add("6");
            q.add("8");
            String tmp="";
            while(tmp.length()<=n){
                tmp=q.peek()+"6";
                q.add(tmp);
                tmp=q.peek()+"8";
                q.add(tmp);
                l.add(q.poll());
            }
            while(q.size()>0){
                l.add(q.poll());
            }
            System.out.println(l.size()-2);
            for(int i=l.size()-3;i>=0;i--){
                System.out.print(l.get(i)+" ");
            }
            System.out.println("");
        }
    }
    
}
