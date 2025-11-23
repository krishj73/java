public class TypeConversion {
    public static void main(String[] args) {
        int a = 10; // implicit - byte-->short-->int-->long-->float-->double
        long b = a;
        System.out.println("implicit type conversion : int to long\n(int) "+a+", (long) "+b);

        double c = 99.99;
        int d = (int) c;
        System.out.println("explicit type conversion : double to int\n(double) "+c+", (int) "+d);

        String str1 = "123"; //only number in strings converted to int
        int toint = Integer.parseInt(str1); //string to int
        System.out.println("string to int : "+toint);

        int num = 456;
        String str2 = String.valueOf(num);
        System.out.println("int to string : "+str2);

    }
}