
import java.util.Scanner;


public class xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]a= new int[n];
        int[]b= new int[n];
        int[]c= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=i;
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[c[i]]>a[c[j]]){
                    int tmp=c[i];
                    c[i]=c[j];
                    c[j]=tmp;
                }
            }
        }
        int ans=0;//thoi diem
        for(int i=0; i<n; i++){
            if(ans>a[c[i]]){//thoi diem vuot qua thoi gian bat dau cua khach
                ans+=b[c[i]];
            }else{
                ans=a[c[i]]+b[c[i]];//thoi diem nho hon thoi gian vi khac dang xet xep hang
            }
        }
        System.out.println(ans);
    }
}
