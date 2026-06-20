public class String1 {
    public static void main(String[] a)
    {
        //String name = new String("Shubham");

        // System.out.println(name.charAt(1)); // this will print the character which is on index 1 that is h
        
        String name = "Shubham";
        name = name + " vishwakarma"; 
        System.out.println("Hello" + name);

        String s1 = "Shubham";
        String s2 = "SHubham";
        String s3 = "Shubham";
        System.out.println(s1==s2); // false
        System.out.println(s1==s3); // true


    }
}



// Mutable strings -> change
// immutable -> can not change

// by default strings are immutable