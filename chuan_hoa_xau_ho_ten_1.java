
import java.util.Scanner;
import java.util.StringTokenizer;


public class chuan_hoa_xau_ho_ten_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            StringTokenizer st= new StringTokenizer(s);
            while(st.hasMoreTokens()){
                StringBuilder b= new StringBuilder("");
                String tmp= st.nextToken();
                b.append(Character.toUpperCase(tmp.charAt(0)));
                for(int i=1; i<tmp.length(); i++){
                    b.append(Character.toLowerCase(tmp.charAt(i)));
                }
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
    
}
