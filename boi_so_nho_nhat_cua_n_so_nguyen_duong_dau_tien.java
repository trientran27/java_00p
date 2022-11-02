
import java.util.Scanner;

// tim cac so la bac của so nguyen to nhung phai nho hon bang n sau đo lay tich cua chung
public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        solve();
        while(t-- > 0){
            int n = sc.nextInt();
            long result = 1;
            for(int i = 2; i <= n; i++){
                int tmp = 1;
                if(prime[i]){
                    while(tmp <= n){
                        tmp *= i;
                    }
                    tmp/=i;
                    System.out.println(tmp);
                    result *= tmp;
                }
            }
            System.out.println(result);
        }
    }
    public static boolean[] prime = new boolean[101];
    public static void solve(){
        for(int i = 2; i <= 100; i++){
            prime[i] = true;
        }
        for(int i = 2; i <= 10; i++){
            if(prime[i]){
                for(int j = i * i; j <= 100; j += i){
                    prime[j] = false;
                }
            }
        }
    }
}
