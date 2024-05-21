public class TypeConversion {
    public static void main(String[] args) {
        /* heirarchy
        smallest to largest
        byte->short->int->float->long->double*/

        int a = 20;
        long b = a;
        System.out.println(b);
        // long c = 20; 
        // int d = c;  error cannot convert long to int lossy conversion!!
    }
}
