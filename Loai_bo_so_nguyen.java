/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loai_bo_so_nguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Loai_bo_so_nguyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        ArrayList <String> lst = new ArrayList<>();
        while(sc.hasNext()){
            String s= sc.next();
            try{
                int n = Integer.parseInt(s);
            }
            catch(NumberFormatException exception){
                lst.add(s);
            }
        }
        Collections.sort(lst);
        for(int i=0; i<lst.size(); i++){
            System.out.print(lst.get(i) + " ");
        }
    }
    
}
