// StringBuffer is thread safe  and StringBuilder is not

public class String2 {
    public static void main(String[] args)
     {
        StringBuffer sb = new StringBuffer("Shubham");
        System.out.println(sb.capacity()); // from this we can check the capacity of stringBuffer
        System.out.println(sb.length()); // it provids the length of the string
        sb.append(" Vishwakarma");

        sb.deleteCharAt(2);

        sb.insert(0, "Java ");
        System.out.println(sb);

     }
}
