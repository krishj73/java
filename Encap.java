class Student{
    private String name;
    private int rollno;

    void setName(String s){
        name = s;
    }
    void setRollno(int roll){
        rollno = roll;
    }
    String getName(){
        return name;
    }
    int getRollno(){
        return rollno;
    }

}
public class Encap {
    public static void main(String[] args) {      
        Student s1 = new Student();
        s1.setName("Krish");
        s1.setRollno(1);
        System.out.print("Name : "+s1.getName()+", Roll no. : "+s1.getRollno());
    }
}