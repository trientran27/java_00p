
import java.util.Scanner;


public class cat_doi {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            String s= sc.next();
            String a=solve(s);
            while(!a.isEmpty() && a.charAt(0)=='0'){
                a= a.substring(1);//cat ki tu 0 dang truoc
            }
            if(a.isEmpty()){
                System.out.println("INVALID");
            }else{
                System.out.println(a);
            }
            t--;
        }
    }
    public static String solve(String s){
        String tmp="";
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='0'){
                tmp+='0';
            }else if (s.charAt(i)=='1'){
                tmp+='1';
            }else if (s.charAt(i)=='8'){
                tmp+='0';
            }else if (s.charAt(i)=='9'){
                tmp+='0';
            }else{
                return "INVALID";
            }   
        }
        return tmp;
    }
    
}

