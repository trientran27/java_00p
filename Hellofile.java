/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hellofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
    
}
