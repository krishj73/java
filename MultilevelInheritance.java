//A-->B-->C
class A{
    void name(){
        System.out.println("hi! my name is A");
    }
}
class B extends A{          //all methods of super/parent class accessible/override-able by sub/child class
    void work(){
        System.out.println("i'm a student");
    }
}
class C extends B{          //all methods of super/parent class accessible/override-able by sub/child class
    void age(){
        System.out.println("my age is 21");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.name();
        obj.work();
        obj.age();
    }
}