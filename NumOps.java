import java.util.Scanner;

public class NumOps{
    static int sum(int num1, int num2){
            int add = num1+num2;
            return add;
    }
    static int diff(int num1, int num2){
        int diff = num1-num2;
        return diff;
    }
    static int prod(int num1, int num2){
        int prod = num1*num2;
        return prod;
    }    
    static int div(int num1, int num2){
        int div = num1/num2;
        return div;
    }

    public static void main(String [] args){        
        System.out.print("enter 2 numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("the sum is "+sum(num1, num2));
        System.out.println("the difference is "+diff(num1, num2));
        System.out.println("the product is "+prod(num1, num2));
        System.out.println("the division is "+div(num1, num2));

        sc.close();
    }
}