package J07005_SO_KHAC_NHAU_TRONG_FILE_2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1005];
        for (int i = 0; i < 100000; i++) {
            int x = in.readInt();
            a[x]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (a[i] != 0)
                System.out.println(i + " " + a[i]);
        }
    }
}
