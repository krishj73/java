import java.util.Scanner;
import java.util.Arrays;
public class Functions {
    static void sum1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("enter number 2 : ");
        int b = sc.nextInt();

        int sum1 = a + b;
        System.out.println("the sum is "+sum1); //return sum1;
        sc.close();
    }

    static int sum2(int a, int b){
        return a+b;
    }
    
    static String intro(String name){
        String message = "hello "+name;
        return message;
    }
    
    //variable length args - when no. of arguments is not known
    static void num(int ...n){
        System.out.println(Arrays.toString(n));
    }

    static void string(String ...s){
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        sum1();
        /*int result = sum1();
        System.out.println("the sum is "+result);*/
        System.out.println("the sum is "+sum2(10, 20));
        
        String str = intro("krish");
        System.out.println(str);

        num(1,2,3);
        string("abc", "def");
    }
}