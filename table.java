import java.util.*;

public class table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("enter the number you want table of :");
        int n =sc.nextInt();
        System.out.println("the table is :");
       
        for(int i=1;i<11;i++){
            
            System.out.println(n + " x " + i + " = " + (n * i));

        }
    }
    
}
