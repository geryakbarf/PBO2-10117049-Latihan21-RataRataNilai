/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi 
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung rata - rata
 * nilai Mahasiswa
 */
public class PBO210117049Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahSiswa;
        double rataRata;
        int i = 1;
        double jumlahNilai = 0;
        double nilai;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahSiswa = scan.nextInt();

        while (i <= jumlahSiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scan.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
            i = i + 1;
        }
        System.out.println("");

        //menghitung Rata - Rata
        rataRata = jumlahNilai / jumlahSiswa;
        System.out.println("Maka, Rata Rata nilai nya : " + rataRata);
        System.out.println("Developed by : Gery Akbar Fauzi");
    }

}
