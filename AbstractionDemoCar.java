//partial abstraction using abstract keyword - "extends"
abstract class Vehicle{
    abstract void intro(); //abstract method - can add many
    
    void start(){          //concrete method - can add many
        System.out.println("the vehicle is started");
    }

    static void motion(){  //static method - can add many, no need of obj declaration [class.method()]
        System.out.println("this vehicle started moving");
    }

    Vehicle(){             //constructor
        System.out.println("vehicle constructor executed first");
    }
}

class AbstractionDemoCar extends Vehicle{
    void intro(){
        System.out.println("this is a car");
    }
    public static void main(String[] args){
        AbstractionDemoCar c = new AbstractionDemoCar();
            c.intro();
            c.start();
            Vehicle.motion();
    }
}
/*abstraction via abstract class extending another abstract class
abstract class Vehicle{
    abstract void intro();
}
abstract class Car extends Vehicle{
    abstract void start();
}
class MercedesBenz extends Car{                               [all abstract methods of vehicle & car overriden]
    void intro(){
            System.out.println("this is a mercedes benz car");
    }
    void start(){
        System.out.println("the car is started");
    }
}
class Main{
    public static void main(String[] args){
        Vehicle v = new MercedesBenz();
        v.intro();
        v.start();
    }
}
1. final methods can be created in abstract class but cannot be overriden by subclass
2. no abstract final class, as they need to be subclassed & final prevents subclassing
3. no abstract private methods, as they need to be overriden by subclasses but private will prevent it
*/