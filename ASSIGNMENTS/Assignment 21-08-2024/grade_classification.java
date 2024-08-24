import java.util.Scanner;

public class grade_classification {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int input = sc.nextInt();

        if(input >= 90){
            System.out.println("A");
        }
        else if (input >= 80){
            System.out.println("B");
        }
        else if (input >= 70){
            System.out.println("C");
        }
        else if (input >= 60){
            System.out.println("D");
        
        }
        else{
            System.out.println("F");
        }
    }
    
}
