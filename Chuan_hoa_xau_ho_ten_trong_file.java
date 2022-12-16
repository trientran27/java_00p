/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuan_hoa_xau_ho_ten_trong_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Chuan_hoa_xau_ho_ten_trong_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(true){
            String s=  sc.nextLine();
            if(s.equals("END")){
                break;
            }
            System.out.println(chuanhoa(s.toLowerCase()));
        }
    }
    public static String chuanhoa(String s){
        StringTokenizer st= new StringTokenizer(s);
        String res="";
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            StringBuilder sb = new StringBuilder(tmp);
            //thay doi ki tu ow vi tri index trong sb bang 1 ki tu khac
            sb.setCharAt(0, Character.toUpperCase(tmp.charAt(0)));
            res+=sb.toString()+" ";
        }
        return res.trim();//xoa khoang trang dau cuoi
    }
}
