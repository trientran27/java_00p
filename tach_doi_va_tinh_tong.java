
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class tach_doi_va_tinh_tong {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String tmp = sc.next();
        while(tmp.length() > 1){
            BigInteger a = new BigInteger(tmp.substring(0, tmp.length() / 2));
            BigInteger b = new BigInteger(tmp.substring(tmp.length() / 2));
            tmp = a.add(b).toString();
            System.out.println(tmp);
        }
    }
}
