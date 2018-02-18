package com.tel.dedyhendryan.dedyhendryansyahputra_1106134186_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;


public class DineIn extends AppCompatActivity {
    Spinner nomeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");
        nomeja = findViewById(R.id.nomormeja);

    }

    public void CekMenu(View view) {
        Toast.makeText(DineIn.this,nomeja.getSelectedItem().toString() + "dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this, MenuMakanan.class));
        finish();
    }
}

