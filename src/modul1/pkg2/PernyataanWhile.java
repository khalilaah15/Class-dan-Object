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
public class PernyataanWhile {
    public static void main (String[] args){
        Scanner masukkan = new Scanner (System.in);
        int a=0, total=0, bil=7;
        while (bil!=0){
            a++;
            System.out.print("Masukkan Bilangan Ke-"+a+" : ");
            bil = masukkan.nextInt();
            total += bil;
        }
        System.out.print("Total Jumlah "+(a-1)+" Bilangan : ");
        System.out.println("Total");
    }
}
