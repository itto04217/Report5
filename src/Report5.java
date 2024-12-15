import java.lang.NullPointerException;

public class Report5 {
    public static void main(String args[]){
        try{
            String str;
            str = null;
            System.out.println(str.length());
        }catch(NullPointerException n){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(n.getMessage());
        }    
    }
}
