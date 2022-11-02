
import java.math.BigInteger;
import java.util.Scanner;


public class hieu_so_nguyen_lon_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger c = (x.subtract(y)).abs();
            String res= c.toString();
            if(res.length()<a.length() || res.length()<b.length()){
                res='0'+res;
            }
            System.out.println(res);
            
        }
    }
    
}
