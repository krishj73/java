/*import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //byte, short, float, double, long, character, string (line)
        System.out.println("you entered "+a);

        sc.close();
    }
}*/
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.println("You are " + age + " years old.");
        
        sc.close();
    }
}