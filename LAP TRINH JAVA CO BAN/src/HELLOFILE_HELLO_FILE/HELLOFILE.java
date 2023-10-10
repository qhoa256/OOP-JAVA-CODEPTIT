package HELLOFILE_HELLO_FILE;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.print(s + "\n");
        }
    }
}
