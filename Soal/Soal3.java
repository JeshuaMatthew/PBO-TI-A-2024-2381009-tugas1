package Soal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String kalimat;
        Scanner input = new Scanner(System.in);
        int sumKata = 1;
        System.out.print("Masukan Kata Dalam Camelcase : ");
        kalimat = input.next();
        char[] kata = kalimat.toCharArray();

        char karakterPertama = kalimat.charAt(0);
        if ((int) karakterPertama >= 65 && (int) karakterPertama <= 90) {
            System.out.println("Kalimat Yang Anda Masukan Tidak Dalam Format Camelcase !!!!");
        } else {
            for (char huruf : kata) {
                if ((int) huruf >= 65 && (int) huruf <= 90) {
                    sumKata++;
                }
            }
            System.out.println("Jumlah Kata : " + sumKata);
        }
    }
}
