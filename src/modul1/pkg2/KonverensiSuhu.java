/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1.pkg2;

/**
 *
 * @author Khalilullah Nuraini
 */
public class KonverensiSuhu {
    public static void main(String[] args) {
        int c = 78;
        System.out.println("Convert Celcius to Reamur : " +CtoR(c));
        System.out.println("Convert Celcius to Fahrenheit : " +CtoF(c));
        System.out.println("Convert Celcius to Kelven : " +CtoK(c));

    }

    static double CtoR (double c){
      return 0.8*c;
    }
    static double CtoF (double c) {
        return 1.8*c+32;
    }
    static double CtoK (double c) {
        return c+273;
    }
}
//2.Buat program konversi suhu 78o C ke dalam satuan Reamur, Farenheit dan Kelvin
