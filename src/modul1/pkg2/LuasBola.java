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
public class LuasBola {

    public static void main(String[] args) {

        Scanner bola = new Scanner(System.in);
        System.out.println("Masukkan Nilai Jari-jari : ");
        int jari = bola.nextInt();

        System.out.println(
                LuasBola.hitung(jari)
        );
    }
    static double hitung(int r){
        return 4 * Math.PI * Math.pow(r, 2); // return L=4*phi*r^2
    }
}
//math.pow merupakan cara penulisan bentuk pangkat di java

