
import java.math.BigInteger;
import java.util.Scanner;


public class tong_so_nguyen_lon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.add(b));
        }
    }
    
}
