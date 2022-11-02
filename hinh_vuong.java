
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;


public class hinh_vuong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int xt1= sc.nextInt();
        int yt1= sc.nextInt();
        int xp1= sc.nextInt();
        int yp1= sc.nextInt();
        
        int xt2= sc.nextInt();
        int yt2= sc.nextInt();
        int xp2= sc.nextInt();
        int yp2= sc.nextInt();
        
        int xmin= min(xt1, xt2);
        int ymin= min(yt1, yt2);
        int xmax= max(xp1, xp2);
        int ymax= max(yp1, yp2);
        int gmax= max(abs(xmax-xmin), abs(ymax-ymin));
        System.out.println(gmax*gmax);
    }
    
}
