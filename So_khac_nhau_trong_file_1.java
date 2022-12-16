/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_khac_nhau_trong_file_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class So_khac_nhau_trong_file_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new  Scanner(file);
        Map<Integer, Integer> mp= new TreeMap<>();
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            if(mp.containsKey(n)){
                mp.put(n, mp.get(n)+1);
            }else{
                mp.put(n, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entry = mp.entrySet();
        for(Map.Entry<Integer, Integer> x : entry){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    
}
