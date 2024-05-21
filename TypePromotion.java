public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);

        int c = 10;
        float d = 10.12f;
        long e = 20;
        double f = 30;
        double ans = c+d+e+f;
        System.out.println(ans);

        //while multiplying if type cast not used then it will throw error as it converts all values to int means g becomes int inside h variable
        byte g = 5;
        byte h = (byte)(g*2);
        System.out.println(h);
    }
}
