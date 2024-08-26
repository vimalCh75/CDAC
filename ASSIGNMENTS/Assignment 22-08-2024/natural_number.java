import java.util.*;

public class natural_number{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("sum of the first "+ n + " natural number : "  + sum);
    }
    
}
