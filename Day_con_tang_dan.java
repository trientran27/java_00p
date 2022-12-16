/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day_con_tang_dan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day_con_tang_dan {
    public static int []x= new int[100];
    public static List<String> lst = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DAYSO.in");
        Scanner sc = new Scanner(file);
        int n= sc.nextInt();
        int []a = new int[100];
        int i=0;
        while(sc.hasNext()){
            a[i]=sc.nextInt();
            i++;
        }
        x[0]=0;
        Try(0, n, a, 1);
        Collections.sort(lst);
        for(int j=0; j<lst.size(); j++){
            System.out.println(lst.get(j));
        }
    }
    public static void Try(int i, int n, int a[], int cnt){
        if(cnt >= 3){
            String tmp = "";
            for(int j = 1; j < cnt; j++){
                tmp += x[j] + " ";
            }
            lst.add(tmp);
        }
        for(int j = i; j < n; j++){
            if(x[cnt - 1] < a[j]){
                x[cnt] = a[j];
                Try(j + 1, n, a, cnt + 1);
            }
        }
    }
}
