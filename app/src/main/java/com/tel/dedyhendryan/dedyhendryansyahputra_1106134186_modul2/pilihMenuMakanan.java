package com.tel.dedyhendryan.dedyhendryansyahputra_1106134186_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class pilihMenuMakanan {
    int foto;
    String nama;
    int harga;
    String komposisi;

    public pilihMenuMakanan(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}


