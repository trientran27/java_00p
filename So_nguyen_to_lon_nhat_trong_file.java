/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_nguyen_to_lon_nhat_trong_file;

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
public class So_nguyen_to_lon_nhat_trong_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int []s= new int[1000005];
        for(int i=0; i<1000000; i++){
            s[i]=1;
        }
        s[0]=s[1]=0;
        for(int i=2; i<1000; i++){//sang nt
            if(s[i]==1){
                for(int j=i*i; j<1000000; j=j+i){
                    s[j]=0;
                }
            }
        }
        InputStream file = new FileInputStream("DATA.in");
        ObjectInputStream input = new ObjectInputStream(file);
        List<Integer> lst = (List<Integer>) input.readObject();//doc du lieu theo kieu object
        int []f= new int[1000005];
        for(int i:lst){
            f[i]++;
        }
        int dem=0;
        for(int i=1000000; i>=0; i--){
            if( s[i]==1 && f[i] > 0){
                dem++;
                System.out.println(i+ " "+ f[i]);
            }
            if(dem==10) break;
        }
        input.close();
    }
    
}
