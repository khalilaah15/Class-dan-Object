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
public class Biodata {
        public static void main(String[] args) {
        {
            System.out.println(nama());
            System.out.println(nis());
            System.out.println(TempatLahir());
            System.out.println(TanggaLahir());
            System.out.println(kelamin());
            System.out.println(alamat());
            System.out.println(motto());
        }

    }

    public static String nama () {
        final String nama = "Nama : Khalilullah Nuraini";
        return nama;
    }
    public static String nis () {
        final String nis = "NIS : 542211137";
        return nis;
    }
    public static String TempatLahir () {
        final String tempat = "Tempat lahir : Malang";
        return tempat;
    }
    public static String TanggaLahir () {
        final String tanggal = "Tanggal Lahir : 15 Januari 2006";
        return tanggal;
    }
    public static String kelamin () {
        final String kelamin = "Jenis Kelamin : Perempuan";
        return kelamin;
    }
    public static String alamat () {
        final String alamat = "Alamat di Malang : Jl. Danau Limboto Barat Dalam VII A4 F33 Sawojajar Malang";
        return alamat;
    }
    public static String motto () {
        final String moto = "Motto hidup : Lihat Kenyataan";
        return moto;

    }
}
