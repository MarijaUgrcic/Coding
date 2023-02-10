package TreciCas;

public class Inkrement {
    public static void main(String[] args) {

        int x = 10;
        int y = x++;

        int a = 10;
        int b = ++a;

        System.out.println(x);
        System.out.println(y);

        System.out.println(a);
        System.out.println(b);

        int c = 2, d = 3;
        int res = c * (d++) + d;
        int res1 = c * (++d) + d;

        System.out.println(res);
        System.out.println(res1);
    }
}
