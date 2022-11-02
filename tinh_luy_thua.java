
import java.util.Scanner;
import java.math.BigInteger;

public class tinh_luy_thua {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        BigInteger b= sc.nextBigInteger();
        BigInteger m= new BigInteger("1000000007");
        //neu ab bang 0 thi dung
        while(!a.equals(new BigInteger("0")) || !b.equals(new BigInteger("0"))){
            System.out.println(a.modPow(b, m));
            a= sc.nextBigInteger();
            b= sc.nextBigInteger();
        }
    }
}