
import java.util.Scanner;


public class khai_bao_lop_hinh_chu_nhat {
    private double width, height;
    public String color;
    public khai_bao_lop_hinh_chu_nhat(){
        
    }
    public khai_bao_lop_hinh_chu_nhat(double width, double height, String color){
        
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width= width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height= height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        String tmp="";
        tmp= Character.toUpperCase(color.charAt(0)) + color.substring(1).toLowerCase();
        this.color=tmp;
    }
    public double findArea(){
        return this.width*this.height;
    }
    public double findPerimeter(){
        return (this.width + this.height)*2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        khai_bao_lop_hinh_chu_nhat cn= new khai_bao_lop_hinh_chu_nhat();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        cn.setWidth(width);
        cn.setHeight(height);
        cn.setColor(color);
        if(cn.getHeight() <=0 || cn.getWidth()<=0){
            System.out.println("INVALID");
        }else{
            System.out.println((int)cn.findPerimeter()+" "+(int)cn.findArea()+ " "+ cn.getColor());
        }
    }
}
