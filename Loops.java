import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //print nums
        System.out.println("----------for----------");
        System.out.print("nums upto "+num+" : ");
        for (int i=0; i<=num; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //print sum of nums upto n
        int sum = 0;
        for (int i=0; i<=num; i++){
            sum+=i;
        }
        System.out.println("sum of nums upto "+num+" : "+sum);

        //---------------------------------------------------------
        System.out.println("----------while----------");
        int i=0;
        System.out.print("nums upto "+num+" : ");
        while (i<=num) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //sum declared already at line 17
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println("sum of nums upto "+num+" : "+sum);

        //---------------------------------------------------------
        System.out.println("----------do while----------");
        int a=0;
        System.out.print("nums upto "+num+" : ");
        do {
            System.out.print(a+" ");
            a++;
        }
        while(a<=num);
        System.out.println();

        int sum1=0, b=0;
        do{
            sum1+=b;
            b++;
        }
        while (b<=num);
        System.out.println("sum of nums upto "+num+" : "+sum1);

        sc.close();
    }
}