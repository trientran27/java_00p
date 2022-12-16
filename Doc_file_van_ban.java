/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doc_file_van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Doc_file_van_ban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    
}
