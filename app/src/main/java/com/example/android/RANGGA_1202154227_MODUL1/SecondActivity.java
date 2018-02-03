package com.example.android.RANGGA_1202154227_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView porsi;
    TextView tempat;
    TextView nasi;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String HasilTempat = intent.getStringExtra("tempat");
        String HasilMenu = intent.getStringExtra("menu");
        String HasilJumlah = intent.getStringExtra("jumlah");
        String HasilHarga = intent.getStringExtra("Harga");

        int TotalHarga = Integer.valueOf(HasilHarga)*Integer.valueOf(HasilJumlah);

        tempat = (TextView)findViewById(R.id.textViewH3);
        tempat.setText(HasilTempat);

        nasi = (TextView)findViewById(R.id.textViewNasi);
        nasi.setText(HasilMenu);

        porsi = (TextView)findViewById(R.id.textViewJum);
        porsi.setText(HasilJumlah);

        harga = (TextView)findViewById(R.id.textViewGa);
        harga.setText(String.valueOf(TotalHarga));

        if (TotalHarga > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
