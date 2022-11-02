
import java.util.Scanner;
import java.util.Stack;


public class rut_gon_xau_ky_tu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st= new Stack();
        String s= sc.next();
        for(int i=0; i<s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }else{
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.size()==0){
            System.out.println("Empty String");
        }else{
            String res="";
            while(!st.empty()){
                res=st.peek()+res;
                st.pop();
            }
            System.out.println(res);
        }
    }
    
}
