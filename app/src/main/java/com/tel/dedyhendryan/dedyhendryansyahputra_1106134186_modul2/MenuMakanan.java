package com.tel.dedyhendryan.dedyhendryansyahputra_1106134186_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuMakanan extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihMenuMakanan> menumakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        setTitle("Menu");

        menumakanan = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        menumakanan.add(new pilihMenuMakanan(R.drawable.steakk, "Steakk Daging", 45000, "Daging, Daun Kemangi, Saus"));
        menumakanan.add(new pilihMenuMakanan(R.drawable.pizza, "Pizza American", 70000, "Sossis, daging, keju"));
        menumakanan.add(new pilihMenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng", 50000, "Ayam Goreng dengan sambal dan lalapan"));
        menumakanan.add(new pilihMenuMakanan(R.drawable.nasigoreng, "Nasi Goreng Seafood", 35000, "Nasi Goreng dengan bumbu rahasia dicampur dengan aneka seafood"));
        menumakanan.add(new pilihMenuMakanan(R.drawable.kopi, "Coffee Expresso", 550000, "Bubuk kopi espresso pilihan"));
        menumakanan.add(new pilihMenuMakanan(R.drawable.thaitea, "Thaitea", 50000, "Teh pilihan, susu, bubble"));
        adapter = new mnAdapter(this, menumakanan);
        rv.setAdapter(adapter);
    }
}