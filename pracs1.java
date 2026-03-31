import java.util.Scanner;
class pracs1{
    public static void main(String[] args) {
        /*prime / composite
        1. take input   2. iterate from 2 upto nearest square root of num (square of i<=num)  3. if remainder of num/i = 0, num is composite
        */
        System.out.print("enter a number to find if its prime/composite : ");     //1
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        boolean prime = num1 > 1;
        for (int i = 2; i * i <= num1; i++){                                           //2
            if (num1 % i == 0) prime = false;                                          //3
        }
        System.out.println(prime ? "the number is prime" : "the number is not prime / composite");


        /*armstrong number or not
        1. take input   2. split the number into digits and store           3. find remainder (to find last digit)
        4. take remainder to the power of no. of digits in number & add     4. find quotient (to drop last digit)
        */
        System.out.print("enter a number to find if its armstrong or not : ");    //1
        int num2 = sc.nextInt();
        int temp = num2 , sum = 0;
        int digits = String.valueOf(num2).length();                                    //2

        while(temp > 0){
            int rem = temp % 10;                                                       //3
            sum += Math.pow(rem, digits);                                              //4
            temp /= 10;                                                                //5
        }
        System.out.println(sum == num2 ? "the number is armstrong" : "the number is not armstrong");


        /*factorial of a number
        1. take input   2. run a loop from 2 upto num   3. keep multiplying i while it increments & storing the result in var until loop ends 
        */
        System.out.print("enter a number to find factorial (0-12) : ");             //1
        int num3 = sc.nextInt();
        int result = 1;

        for(int i = 2; i <= num3; i++){                                                //2
            result *= i;                                                               //3
        }
        System.out.println("factorial of the number is : "+result);

        /*if string is palindrome or not
        1. take input
        */
        System.out.print("enter a line to find if its palindrome or not : ");
        String str = sc.nextLine();
        String revstr = "";

        for (int i = str.length() - 1; i>=0; i--){
            revstr += str.charAt(i);
        }
        System.out.println(str.equals(revstr) ? "the string is a palindrome" : "the string is not a palindrome");
        sc.close();
    }
}