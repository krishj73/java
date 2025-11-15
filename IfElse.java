import java.util.Scanner;
public class IfElse{
    public static void main(String[]args){
        System.out.print("enter a number to check if it's odd or even : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //1
        if (num%2==0) {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }

        //2
        System.out.print("enter 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if (a<b){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println(a+" and "+b+" are equal");
        }

        //3
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        if (age>18 && age<100){
            System.out.println("you are eligible to vote");
        }
        else if(age<18 && age>0){
            System.out.println("you are not eligible to vote");
        }
        else{
            System.out.println("invalid age");
        }

        sc.close();
    }
}