import java.util.*;
public class calculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number ");
        int a =sc.nextInt();
        System.out.println("enter second number ");
        int b =sc.nextInt();

        
             System.out.println("press 1 for addition");
             System.out.println("press 2 for subtraction ");
             System.out.println("press 3 for multiplication");
             System.out.println("press 4 for division");

             int i =sc.nextInt();

        switch(i){

            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            default : System.out.println("invalid operation ");
            
        }


        
        

        
        
        

    }
}