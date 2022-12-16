
import java.util.Scanner;


public class phan_so {
    private long tso, mso;
    public phan_so(){
        
    }

    public long getTso() {
        return tso;
    }

    public void setTso(long tso) {
        this.tso = tso;
    }

    public long getMso() {
        return mso;
    }

    public void setMso(long mso) {
        this.mso = mso;
    }
    public long ucln(long tso, long mso){
        if(mso==0) return tso;
        return ucln(mso, tso%mso);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tso= sc.nextLong();
        long mso= sc.nextLong();
        phan_so ps= new phan_so();
        ps.setTso(tso);
        ps.setMso(mso);
        long k= ps.ucln(ps.getTso(), ps.getMso());
        System.out.println(ps.getTso()/k +"/"+ps.getMso()/k);
    }
    
}
