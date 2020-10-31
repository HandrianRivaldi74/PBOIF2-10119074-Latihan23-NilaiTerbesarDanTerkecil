/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan23_nilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskripsi : Program mencari nilai terbesar & terkecil
 */
public class PBOIF2_10119074_Latihan23_Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, jum_nilai, terbesar = 0, terkecil = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai "
                           + "Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jum_nilai = scanner.nextInt();
        int nilai_mhs[] = new int[jum_nilai];
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa Ke-%d = ", i+1);
            if (nilai_mhs[i] < terkecil) {
                terkecil = nilai_mhs[i];
            }
            nilai_mhs[i]= scanner.nextInt();
            if (nilai_mhs[i] > terbesar) {
                terbesar = nilai_mhs[i];
            }
        }

        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n", i+1, nilai_mhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+terbesar);
        System.out.println("Nilai Terkecil adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);
    }
    
}
