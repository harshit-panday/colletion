import java.util.*;
public class slip29 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();

        obj.add("harshit");
        obj.add("sahil");
        obj.add("tanmay");
        obj.add("praveen");

        for(String name:obj){
            System.out.println(name);
        }

        // obj.addFirst("bhai");

        // for(String name:obj){
        //     System.out.println(name);
        // }

        // obj.removeLast();

        // for(String name:obj){
        //     System.out.println(name);
        // }

            System.out.println("linked list size is "+obj.size());

    }
}
