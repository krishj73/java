//complete abstraction using interface - "implements", blueprint of class, multiple inheritance possible
//private & static methods not overriden, default & abstract methods overriden; no constructors & concrete methods allowed
interface Vehicle{
    void intro();           //abstract method - can add many, public by default, only abstract methods allowed

    static void motion(){   //static method - can add many, no need of obj declaration [class.method()]
        System.out.println("this vehicle started moving");
    }
}
class DemoCar implements Vehicle{               //multiple inheritance
    public void intro(){
        System.out.println("this is a car");
    }
}
class InterfaceDemoCar implements Vehicle{      //multiple inheritance
    public void intro(){
        System.out.println("this is a car");
    }
    public static void main(String[] args) {
        InterfaceDemoCar c = new InterfaceDemoCar();
        c.intro();
        Vehicle.motion();

        //runtime polymorphism
        Vehicle v1 = new DemoCar();
        v1.intro();

        Vehicle v2 = new InterfaceDemoCar();
        v2.intro();
    }
}