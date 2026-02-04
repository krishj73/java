//compile time polymorphism
class MathOp {
    int add(int n1, int n2) {
        return n1 + n2;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
    String add(String s1, String s2){
        return s1+" "+s2;
    }
}
//runtime polymorphism
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        //compile time polymorphism
        int n1 = 5, n2 = 10;
        double a = 1.1, b = 2.3, c = 3.5;
        String s1 = "Hello", s2 = "World";

        MathOp obj = new MathOp();
        System.out.println(obj.add(n1,n2));
        System.out.println(obj.add(a, b, c));
        System.out.println(obj.add(s1, s2));

        //runtime polymorphism
        Animal a1 = new Dog();
        a1.sound();
        
        /*Animal a[] = [new Dog(), new Cat()]   - array way
        for (Animal x : a){
            x.sound()
        }
        */
    }
}