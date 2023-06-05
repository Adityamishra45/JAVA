public class StringMethod2{
    public static void main(String[] args) {
       
       //Trim
        // String nottrimmedstr = "     Aditya     ";
        // System.out.println(nottrimmedstr);
        // System.out.println(nottrimmedstr.trim());

        //Substring : we gives start index and it prints from given index to given end index.
        // String name  ="Aditya Kumar Mishra";
        // String substring = name.substring(3,10); //It will take upto index number 9
        // System.out.println(substring);

        //Replace : 
        // String str = "Aditya";
        // String replace = str.replace('i','k');
        // System.out.println(replace);
        // System.out.println(str.replace("tya","ush"));

        //Starts with and Ends with : 
        // String str = "Name";
        // System.out.println(str.startsWith("adi"));
        // System.out.println(str.endsWith("me"));

        //First Charecter :
        String str = "name";
        System.out.println(str.charAt(0)); 
        System.out.println(str.equals("Name"));
        System.out.println(str.equalsIgnoreCase("name"));



    }
}