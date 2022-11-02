
import java.util.Scanner;
import java.util.StringTokenizer;


public class chuan_hoa_xau_ho_ten_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] a= new String[50];
            String s= sc.nextLine();
            StringTokenizer st= new StringTokenizer(s);
            int kt=1;
            int l=0;
            while(st.hasMoreTokens()){
                String tmp= st.nextToken();
                StringBuilder b= new StringBuilder("");
                b.append(Character.toUpperCase(tmp.charAt(0)));
                for(int i=1; i<tmp.length(); i++){
                    b.append(Character.toLowerCase(tmp.charAt(i)));
                }
                kt=0;
                a[l]= ""+b;
                l++;
            }
            for(int j=1; j<l-1; j++){
                System.out.print(a[j]+" ");
            }
            System.out.print(a[l-1]+", ");
            System.out.println(a[0].toUpperCase());
        }
    }
    
}
