import java.util.*;
public class slip6_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of integers:");
        int n=sc.nextInt();
        TreeSet<Integer> integers=new TreeSet<>();
        for(int i=0;i<n;i++){
            System.out.print("enter an integer:");
            integers.add(sc.nextInt());
        }
        System.out.println("the integer in sorted order are");
        for(int integer : integers){
            System.out.println(integer);
        }
        System.out.print("enter an integer to search for :");
        int search=sc.nextInt();
        if(integers.contains(search)){
            System.out.println("the integers"+search+"is present in the collection");
        }else{
            System.out.println("the integers"+search+"is not present in the collection");
        }
    }
}
