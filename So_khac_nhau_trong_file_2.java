/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_khac_nhau_trong_file_2;

import java.io.*;
/**
 *
 * @author Trien Tran
 */
public class So_khac_nhau_trong_file_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    //file nhi phan
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        InputStream file = new FileInputStream("DATA.IN");
        DataInputStream input = new DataInputStream(file);
        int []cnt = new int[1005];
        for(int i=0; i<100000; i++){
            cnt[input.readInt()]++;
        }
        for(int i=0; i<1000; i++){
            if(cnt[i] > 0){
                System.out.println(i+ " "+ cnt[i]);
            }
        }
    }
    
}
