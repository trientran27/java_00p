
import java.util.Scanner;


public class khai_bao_lop_point {
    private double x, y;
    
    public khai_bao_lop_point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            khai_bao_lop_point p1 = new khai_bao_lop_point(x1, y1);
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            khai_bao_lop_point p2 = new khai_bao_lop_point(x2, y2);
            double dis = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            System.out.format("%.4f", dis);
            System.out.println();
        }
    }
    
}
