//String methods operate on Java Strings. They can be used to find length of the String , convert to lowercase, etc.
//Strings are immutable :- cannot be changed.

public class StringMethod {  
    public static void main(String[] args) {
        String name = "Aditya";

        int value  = name.length();   //finding the length.
        System.out.println(value);

        String lowercase = name.toLowerCase();  //to lower case
        System.out.println(lowercase);

        String uppercase = name.toUpperCase();   //to upper case
        System.out.println(uppercase);

        System.out.println(name.toUpperCase());
        
    }
}
