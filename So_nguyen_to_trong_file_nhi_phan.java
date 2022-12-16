/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_nguyen_to_trong_file_nhi_phan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Admin
 */
public class So_nguyen_to_trong_file_nhi_phan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[] s = new int[10005];
        for(int i=0; i<10000; i++){
            s[i]=1;
        }
        s[0]=0;
        s[1]=0;
        for(int i=2; i<=100; i++){//sang nguyen to
            if(s[i]==1){
                for(int j=i*i; j<=10000; j=j+i){
                    s[j]=0;
                }
            }
        }
        InputStream file = new FileInputStream("SONGUYEN.in");
        ObjectInputStream input = new ObjectInputStream(file);
        List<Integer> list = (List<Integer>) input.readObject();//doc du lieu theo kieu object
        int[] f = new int[10005];
        for (int i : list) {
            f[i]++;
        }
        for(int i=0; i<10000; i++){
            if( s[i]==1 && f[i] > 0){
                System.out.println(i+ " "+ f[i]);
            }
        }
    }
    
}
