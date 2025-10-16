package _02_Variable;

public class DataType {
    public static void main(String[] args) {
        long longNum = 3_000_000_000L;
        int a = 65;
        char c = ' ';
        char c1 = 65 + 1;
        System.out.println(c1);

        c = (char)a;
        System.out.println(c);

        a = (int)c;
        System.out.println(a);

    }
}
