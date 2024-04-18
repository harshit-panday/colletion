import java.util.*;
public class practice{
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();

        map.put("pune","411001");
        map.put("mumbai","12342");
        map.put("nashik","123");

        System.out.println(" "+map);

        System.out.println("add");
        Scanner sc=new Scanner(System.in);
        String cityadd=sc.next();
        String codeadd=sc.next();
        map.put(cityadd,codeadd);
        System.out.println(" "+map);

        map.remove("mumbai");
        System.out.println(" "+map);

        System.out.println("search");
        String search=sc.next();
        if(map.containsKey(search)){
            String search1=map.get(search);
            System.out.println(" "+search1);
        }else{
            System.out.println("not found");
        }


    }
}