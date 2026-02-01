class MathOp {
    int add(int n1, int n2) {
        return n1 + n2;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
}
class Polymorphism {
    public static void main(String[] args) {
        int n1 = 5, n2 = 10;
        double a = 1.1, b = 2.3, c = 3.5;

        MathOp obj = new MathOp();
        System.out.println(obj.add(n1,n2));
        System.out.println(obj.add(a, b, c));
    }
}