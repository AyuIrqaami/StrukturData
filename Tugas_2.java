package tugas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Tugas_2 {

    public static void main(String[] args) {
        //1. Array 1D dengan tipe data primitif
        int a[] = new int[2];
        a[0] = 777;
        a[1] = 218;
        byte b[] = {22, 35, 45, 77};
        long c[] = {874, 865, 888, 898};
        short[] d = {67, 68, 69};
        double e[] = {2.18, 2.77};
        float f[] = {2.3f, 2.6f, 1.1f,};
        char[] nama;
        nama = new char[3];
        nama[0] = 'A';
        nama[1] = 'Y';
        nama[2] = 'U';
        boolean g[] = {true, true, false};

        //2. 5 metode mencetak isi Array
        System.out.println("For");
        int v[] = new int[3];
        v[0] = 565;
        v[1] = 97;
        v[2] = 54;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");

        }
        System.out.println();

        System.out.println("===========================");
        System.out.println("For-Each");
        byte cc[] = {22, 35, 45, 77};
        for (int i : cc) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("===========================");
        System.out.println("While");
        long ee[] = {874, 865, 888, 898};
        int i = 0;
        while (i < ee.length) {
            System.out.print(ee[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("===========================");
        System.out.println("Do-While");
        float ff[] = {2.3f, 2.6f, 1.1f,};
        byte j = 0;
        do {
            System.out.print(ff[j] + " ");
            j++;
        } while (j < ff.length);
        System.out.println();

        System.out.println("===========================");
        System.out.println("Kelas Arrays");
        nama = new char[3];
        nama[0] = 'A';
        nama[1] = 'Y';
        nama[2] = 'U';
        System.out.println(Arrays.toString(nama));

        //3. Array 2D dengan inputan
        System.out.println("===========================");
        System.out.println("Array 2D dengan inputan");
        System.out.println("Input nilai indeks");
        int zz[][] = new int[2][2];
        Scanner jw = new Scanner(System.in);
        for (int k = 0; k < zz.length; k++) {
            for (int l = 0; l < zz[k].length; l++) {
                System.out.print("[" + k + "]" + "[" + l + "]" + "= ");
                zz[k][l] = jw.nextInt();

            }

        }
        System.out.println(Arrays.deepToString(zz));
        //4. ArrayList tipe data Wrapper
        System.out.println("===========================");
        System.out.println("ArrayList tipe data wrapper");
        ArrayList<Character> ss = new ArrayList<Character>();
        ss.add('A');
        ss.add('Y');
        ss.add('U');
        System.out.println(ss);

        //5. ArrayLIst bertipe Integer
        System.out.println("===========================");
        System.out.println("ArrayList bertipe Integer");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //menambah nilai
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.print("Data ArrayList " + numbers);
        System.out.println("\nIndeks ke-3 : " + numbers.get(3));

        numbers.set(2, 7);
        System.out.println("Setelah nilai diganti \n" + numbers);

        numbers.remove(3);
        System.out.println("Setelah nilai dihapus \n" + numbers);

        System.out.println("Size ArrayList : " + numbers.size());

    }
}
