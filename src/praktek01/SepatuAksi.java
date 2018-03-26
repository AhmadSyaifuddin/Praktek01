/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author udin'
 */
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu Udin = new Sepatu();
        Sepatu Ali  = new Sepatu();
        Sepatu Andi = new Sepatu();  
        
        Udin.Ukuran=42;
        Udin.Merk="Nike";
        Udin.Warna="Merah";
        Udin.Harga="Rp.350.000";
        Udin.Model="Tali Datar";
        
        Ali.Ukuran=44;
        Ali.Merk="Adidas";
        Ali.Warna="Biru";
        Ali.Harga="Rp.460.000";
        Ali.Model="Tidak Menggunakan Tali";
        
        Andi.Ukuran=38;
        Andi.Merk="Yeezy";
        Andi.Warna="Hitam";
        Andi.Harga="Rp.1.500.000";
        Andi.Model="Tali Zig-Zag";
        
        Udin.MengubahHarga();
        Ali.MengubahHarga();
        Udin.MengubahHarga();
        
    }
 
}
