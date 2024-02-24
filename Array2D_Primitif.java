package tugas_1;

import java.util.Arrays;

public class Array2D_Primitif {

    public static void main(String[] args) {
        System.out.println("Byte");
        byte a[][] = {{1, 2}, {3, 4}};
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println("-------------------------");

        System.out.println("short");
        short V[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(V));
        System.out.println("-------------------------");

        System.out.println("long");
        long JW[][] = {{9, 2}, {6, 9}};
        for (int i = 0; i < JW.length; i++) {
            for (int j = 0; j < JW[i].length; j++) {
                System.out.print(JW[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("-------------------------");
        System.out.println("int");
        int HEE[][] = {{7, 13, 7, 4}, {5, 8, 3, 9}};
        for (int[] i : HEE) {
            for (int j : i) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        System.out.println("-------------------------");
        System.out.println("float");
        float z[][] = {{7.7f, 3.7f}, {2.3f, 6.8f}};
        byte e = 0;
        while (e < z.length) {
            byte f = 0;
            while (f < z.length) {
                System.out.println(z[e][f] + " ");
                f++;
            }
            e++;
        }
        System.out.println("-------------------------");
        System.out.println("double");
        double y[][] = {{2.23, 7.77}, {7.13, 6.95}};
        byte hh = 0;
        do {
            byte kk = 0;
            do {
                System.out.println(y[hh][kk] + " ");
                kk++;
            } while (kk < y[hh].length);
            hh++;
        } while (hh < y.length);

        System.out.println("-------------------------");
        System.out.println("boolean");
        boolean x[][] = new boolean[2][2];
        x[0][0] = true;
        x[0][1] = false;
        x[1][0] = false;
        x[1][1] = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }

        }

        System.out.println("-------------------------");
        System.out.println("char");
        char fav[][] = {{'H', 'Y', 'B', 'E'}};
        System.out.println(Arrays.deepToString(fav));
    }
}
