import java.util.*;
public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name :- ");
        String myFullStringInput = sc.nextLine();
        System.out.println("Enter Int value :- ");
        int myIntInput = sc.nextInt();
        System.out.println("Enter Float value :- ");
        float myFloatInput = sc.nextFloat();
        System.out.println("Enter String :- ");
        String myStringInput = sc.next();
        System.out.println("Enter Byte value :- ");
        Byte myByteInput = sc.nextByte();
        System.out.println("Enter Double value :- ");
        double myDoubleInput = sc.nextDouble();
        System.out.println("Enter Boolean value :- ");
        Boolean myBooleanInput = sc.nextBoolean();
        System.out.println("Enter Short value :- ");
        short myShortNumInput = sc.nextShort();
        System.out.println("Enter Long value :- ");
        long myLongNumInput = sc.nextLong();
        System.out.println("Outputs are as follows :- ");
        System.out.println("Integer Input is :- "+myIntInput);
        System.out.println("Float Input is :- "+myFloatInput);
        System.out.println("String Input is :- "+myStringInput);
        System.out.println("Full name Input is :- "+myFullStringInput);
        System.out.println("Byte Input is :- "+myByteInput);
        System.out.println("Double Input is :- "+myDoubleInput);
        System.out.println("Boolean Input is :- "+myBooleanInput);
        System.out.println("Short Input is :- "+myShortNumInput);
        System.out.println("Long Input is :- "+myLongNumInput);
    }
}
