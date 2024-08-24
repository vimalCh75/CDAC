import java.util.*;

public class good_morning {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int tm = sc.nextInt();
      if( (tm >=5) && (tm <= 12) ) {
        System.out.println("Good Morning");
      }
      else {
        System.out.println("Sleep");
      }
    }
}



