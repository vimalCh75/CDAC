import java.util.*;

public class Discount_Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Amount : " );
        int tp = sc.nextInt();
        

        if (tp >= 1000){
            System.out.println("Your discount will be : " + tp * 20/100);
        }
        else if (tp >= 500){
            System.out.println("Your discount will be : " + tp * 10/100);

        }else {
            System.out.println("Your discount will be : " + tp * 5/100);   
        }
    }
}
