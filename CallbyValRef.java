public class CallbyValRef {
    static void callbyval(int x){
        x = 100;
    }
    /*static void callbyref(int &y){        doesn't support call by reference, y & b will act as same variables since memory address is being prioritized & value stored
        y = 100;
    }*/

    public static void main(String[] args) {
        int a = 10;
        callbyval(a);
        System.out.println(a);
        //x & a act as different variables

        /*int b = 10;
        callbyref(b);
        System.out.println(b);*/ 
    }
}
