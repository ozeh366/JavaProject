package javaPart2;

public class StringMethod {
    public static void main(String[] args) {
        String s = "Hi";
        String s1 = "Lucio";

        System.out.println(s.length()); // length of a string

        System.out.println(s.concat(s1)); // Joining strings

        //Trimming String
        s="    Welcome     .      ";
        System.out.println("Before Trimming string is:" +s);
        System.out.println("After Trimming string is:"+ s.trim());

        //charAt()
        s="welcome";
        System.out.println(s.charAt(5)); // returns character based on index number. Index starts at 0

        //Contains()
        s="turmeric";
        System.out.println(s.contains("eri")); // checks & returns a boolean if a variable contains certain characters.
                                                // it is case sensitive

        //Comparing strings equal() //case-sensitive
        s="love";
        System.out.println(s.equals("love"));//true
        System.out.println(s.equals("Love")); //false

        System.out.println(s.equalsIgnoreCase("Love")); //Returns true

        //Replacing characters
        s="Welcome to java";
        System.out.println(s.replace("java", "selenium"));

        //Substring
        s="love";
        System.out.println(s.substring(1,3)); //ov

        //Converting case
        s="POwEe";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

    }
}
