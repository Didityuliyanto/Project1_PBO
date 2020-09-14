/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

/**
 *
 * @author ASUS
 */
public class Keramik {
    //Atribut
    int Luaslantai;
    
    //Methods
    void keramik_A(){
        double ukurankeramik = 0.3 * 0.3; //satuan diubah ke dalam bentuk meter
        int pcs = 10;  //isi perbox
        int harga = 54000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        System.out.println("Keramik A");
        System.out.println("Ukuran : 30 cm x 30 cm");
        System.out.println("Harga Per box (isi 10) : Rp. 54.000");
        System.out.println("Total harga Rp. " + total + " dengan Luas lantai " + this.Luaslantai + " meterpersegi");
        System.out.println("--------------------------------------------------------");
    }

    void keramik_B(){
        double ukurankeramik = 0.4 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 5; //isi perbox
        int harga = 65000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        System.out.println("Keramik B");
        System.out.println("Ukuran : 40 cm x 40 cm");
        System.out.println("Harga Per box (isi 5) : Rp. 65.000");
        System.out.println("Total harga Rp. " + total + " dengan Luas lantai " + this.Luaslantai + " meterpersegi");
        System.out.println("--------------------------------------------------------");
    }
    
    void keramik_C(){
        double ukurankeramik = 0.3 * 0.4;  //satuan diubah ke dalam bentuk meter
        int pcs = 8; //isi perbox
        int harga = 60000; //harga perbox
        double total = ((this.Luaslantai / ukurankeramik) / pcs)* harga;
        System.out.println("Keramik C");
        System.out.println("Ukuran : 30 cm x 40 cm");
        System.out.println("Harga Per box (isi 8) : Rp. 60.000");
        System.out.println("Total harga Rp. " + total + " dengan Luas lantai " + this.Luaslantai + " meterpersegi");
        System.out.println("--------------------------------------------------------");
    }
    

}
    