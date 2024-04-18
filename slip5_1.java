import java.util.*;
public class slip5_1{
    public static void main(String args[]){
        Hashtable<String,String> ht=new Hashtable<String,String>();
        
        ht.put("amit","1234567890");
        ht.put("praveen","135796324");
        ht.put("suraj","150258347689");
        ht.put("tanmay","1234789054");
        ht.put("sahil","123456123456");
        
        Enumeration<String> e=ht.keys();
        
        while(e.hasMoreElements()){
            String key=e.nextElement();
            System.out.println("student name:"+key);
            System.out.println("student number:"+ht.get(key));
        }

    }
}