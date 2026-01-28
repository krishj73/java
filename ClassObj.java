import java.util.*;
class Student{
    static void getInfo(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter name of student : ");
        String name = sc.nextLine();

        System.out.print("enter roll number : ");
        int rollno = sc.nextInt();
        
        System.out.println("-----student details :-----");
        System.out.println("name : "+name);
        System.out.println("roll no. : "+rollno);

        sc.close();
    }
}
public class ClassObj {
    public static void main(String[] args) {
        Student.getInfo();
    }
}
