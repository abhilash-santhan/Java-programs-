import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
         int a =sc.nextInt();
         System.out.println("enter b ");
         int b= sc.nextInt();;
         int c=a;// empty varibale 
         a=b;
         b=c;
        System.out.println("after swapping a is :");
        System.out.println(a);
        System.out.println("after swapping b is :");
        System.out.println(b);
    }
}
