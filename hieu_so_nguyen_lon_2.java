
import java.math.BigInteger;
import java.util.Scanner;


public class hieu_so_nguyen_lon_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        BigInteger c = x.subtract(y);
        System.out.println(c);
    }
    
}
