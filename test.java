package PBO;

import java.util.Scanner;

public class test {
        private static String n;
    private static int k, s;
    private static double i,ku;

    public static void main(String[] args){
        Scanner test = new Scanner(System.in);
        System.out.println("Masukkan nama siswa: ");
        String nama = test.nextLine();

        System.out.println("Masukkan jumlah sks: ");
        int s = test.nextInt();

        System.out.println("Masukkan kredit nilai: ");
        int k = test.nextInt();

        if (k >= 75 ){
            System.out.println("poin kredit adalah A");
        }else{
            System.out.println("poin kredit adalah B");
        }

        System.out.print("nama mahasiswa adalah: "+ nama + "mendapatkan IPK " + k / s);
    }

    
}
