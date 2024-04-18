import java.util.*;
public class slip19_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of integer");
        int n=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.print("enter an integer");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println("negative integers in the list");
        for(int num:list){
            if(num<0){
                System.out.println(num);
            }
        }
    }
}
