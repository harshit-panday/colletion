import java.util.*;
public class slip16_1{
    public static void main(String args[]){
        TreeSet<String> colors =new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("colors in ascending order:");
        for(String color:colors){
            System.out.println(color);
        }
    }
}