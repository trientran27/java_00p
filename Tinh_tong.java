/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_tong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Trien Tran
 */
public class Tinh_tong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new  File("DATA.in");
        Scanner sc = new  Scanner(file);
        long sum=0;
        while(sc.hasNext()){
            try{
                int n = Integer.parseInt(sc.next());
                sum+=n;
            }catch(NumberFormatException exception){
                continue;
            }
        }
        System.out.println(sum);
    }
    
}
