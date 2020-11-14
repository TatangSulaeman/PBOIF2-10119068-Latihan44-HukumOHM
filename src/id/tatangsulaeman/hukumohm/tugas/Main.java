/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.hukumohm.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan hukum ohm
 */
public class Main {
    public static void main(String []args){
        Baterai dataBaterai = new Baterai();
        System.out.println();
        Baterai baterai = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai.getKuatArus()+" ampere");
        System.out.println("Hambatan : " + baterai.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : " + baterai.hitungTegangan()+ " volt");
    }
}
