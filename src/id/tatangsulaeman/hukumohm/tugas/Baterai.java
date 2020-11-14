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
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(){
        String outputText = 
                "=====HUKUM OHM=====" + "\n" +
                "Kuat arus yang mengalir pada suatu kawat penghantar" + "\n" + 
                "akan berbanding lurus dengan potensial" + "\n" + 
                "pada ujung ujung kawat penghantar tersebut" + "\n" +
                "asalkan suhu kawat dijaga konstan";
        System.out.println(outputText);
    }
    
    public Baterai(float kuatArus, float hamabatan){
        this.kuatArus = kuatArus;
        this.hambatan = hamabatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return getKuatArus()*getHambatan();
    }
}
