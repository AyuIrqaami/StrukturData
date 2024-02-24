package tugas_1;

import java.util.Arrays;

public class Array_TipeDataPrimitif {

    public static void main(String[] args) {
        byte b[] = {1, 2};
        System.out.print("Data byte = " + b[0]);
        System.out.println(" " + b[1]);
        System.out.println("--------------------");

        short t[] = {3, 4, 5};
        for (short i = 0; i < 3; i++) {
            System.out.println("Data short = " + t[i]);

        }
        System.out.println("--------------------");

        int txt[] = new int[3];
        txt[0] = 6;
        txt[1] = 7;
        txt[2] = 8;
        for (int i = 0; i < txt.length; i++) {
            System.out.println("Data int = " + txt[i]);

        }
        System.out.println("--------------------");

        long s[] = {9, 10};
        for (long value : s) {
            System.out.println("Data long = " + value);

        }
        System.out.println("--------------------");

        float e[] = {1.7f, 7.7f};
        byte z = 0;
        while (z < e.length) {
            System.out.println("Data float = " + e[z]);
            z++;
        }
        System.out.println("--------------------");

        double n[] = {1.35, 1.49, 3.75};
        byte x = 0;
        do {
            System.out.println("Data double = " + n[x]);
            x++;

        } while (x < n.length);

        System.out.println("--------------------");
        System.out.println("boolean");
        boolean h[] = {true, false, true};
        System.out.println(Arrays.toString(h));

        System.out.println("--------------------");
        char a[] = {'a', 'y', 'u'};
        String print = new String(a);
        System.out.println("Data char = " + print);

    }

}
