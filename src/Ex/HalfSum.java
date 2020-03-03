package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) throws IOException {
        File fileA = new File("src\\seqA.txt");
        File fileB = new File("src\\seqB.txt");
        Scanner scannerA = new Scanner(fileA);
        Scanner scannerB = new Scanner(fileB);

        int aNext = 0;
        int aPrev = 0;
        int bPrev = 0;
        int bNext = 0;
        int aCur = 0;
        int bCur = 0;

        if (scannerB.hasNext()) {
            bCur = bNext;
        }

        if (!scannerA.hasNext()) {
            System.out.println("File A is empty");
            System.exit(-1);
        } else if (!scannerB.hasNext()) {
            System.out.println("File B is empty");
            System.exit(-1);
        }


    }
}