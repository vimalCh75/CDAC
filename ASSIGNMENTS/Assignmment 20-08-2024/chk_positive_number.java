import java.util.*;

public class chk_positive_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is Negative");
        }
        
    }
    
}
