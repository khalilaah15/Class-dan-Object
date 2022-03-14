/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Khalilullah Nuraini
 */
public class Beasiswa {
    public static void main (String[] args){
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Masukkan Nilai TPA : ");
        int TPA = masukkan.nextInt();
        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        int BahasaInggris = masukkan.nextInt();
        if ((TPA >85) && (BahasaInggris >80))
            System.out.println("Siswa Dapat Beasiswa");
        else 
            System.out.println("Siswa Tidak Dapat Beasiswa");
    }
}
