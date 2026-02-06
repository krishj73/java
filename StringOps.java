class StringOps{
    public static void main(String[] args) {
        String name = "krish";
        String prof = "student";
        int age = 21;
        double gpa = 9.0;
        char symbol = '$';
        boolean yesno = true;

        System.out.println("my name is "+name+", i'm a "+prof+" aged "+age+", my gpa is "+gpa+", my fav symbol is "+symbol+" and all this is "+yesno);
        
        String formattedString = String.format("my name is %s, i'm a %s aged %d, my gpa is %f, my fav symbol is %c and all this is %b",name,prof,age,gpa,symbol,yesno);
        System.out.println(formattedString);
        
        /*
        .isEmpty() - checks if string empty (true) or not (false)
        .length() - length of string
        .toUpperCase() - converts to uppercase
        .toLowerCase() - converts to lowercase
        string1.equals(string2) - checks if equal ; returns true/false
        string.replace("a","b") - replaces a with b
        string.contains("a") - returns true/false
        
        String string1 = new String("abc");
        String string2 = new String("abc");
        */
    }
}