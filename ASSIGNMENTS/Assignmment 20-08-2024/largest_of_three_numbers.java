import java.util.*;

public class largest_of_three_numbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = sc.nextInt(); 
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.print("Enter C : ");
        int C = sc.nextInt();
        if ((A >= B) && (A >=C)) {
            System.out.println("Maximum of " + A+", " +B+", "+ "and "+ C +" is: "+ A);
        }
        else if (B >= C) {
            System.out.println("Maximum of " + A+", " +B+", "+ "and "+ C +" is: "+ B);

        }
        else {
            System.out.println("Maximum of " + A+", " +B+", "+ "and "+ C +" is: "+ C);
        }
    }
    
}