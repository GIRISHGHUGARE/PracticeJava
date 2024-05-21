import java.util.*;
public class PQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Q1 :- Average of three numbers
        System.out.println("Enter first number :- ");
        int A = sc.nextInt();
        System.out.println("Enter first number :- ");
        int B = sc.nextInt();
        System.out.println("Enter first number :- ");
        int C = sc.nextInt();
        System.out.println("Average of A , B and C are :- " + ((A+B+C)/3));

        //Q2 :- Side of Square
        System.out.println("Enter side of square :- ");
        int side = sc.nextInt();
        System.out.println("Area of the square :- " + (side*side));

        //Q3 :- gst shop
        System.out.println("Enter value for pen :- ");
        float pen = sc.nextFloat();
        System.out.println("Enter value for pencil :- ");
        float pencil = sc.nextFloat();
        System.out.println("Enter value for eraser :- ");
        float eraser = sc.nextFloat();
        float penGstTax = (18/100)*pen;
        float pencilGstTax = (18/100)*pencil;
        float eraserGstTax = (18/100)*eraser;
        float totalBill = pen + pencil + eraser + penGstTax + pencilGstTax + eraserGstTax;
        System.out.println("Total Bill :- " + totalBill);

        //Q4 :- Check output 
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        //choose largest data type which is double
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);

        //Q5 :- Will work or not 
        int $ =24;
        System.out.println($);
        /*
        No, the statement will not give any error.Names of variables are called identifiers in Java.
        Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
        According to the rule the given variable name is a valid identifier.
        */
    }
}
