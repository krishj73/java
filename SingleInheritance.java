//A-->B
class A {
    void name(){
        System.out.println("hi! my name is A");
    }
}
class B extends A{          //all methods of super/parent class accessible/override-able by sub/child class
    void work(){
        System.out.println("i'm a student");
    }
}
class SingleInheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.name();
        obj.work();
    }
}