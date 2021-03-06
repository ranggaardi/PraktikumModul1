package com.example.android.RANGGA_1202154227_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText menu;
    private EditText jumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        menu = (EditText)findViewById(R.id.editText1);
        String makan = menu.getText().toString();

        jumlah = (EditText)findViewById(R.id.editText2);
        String porsi = jumlah.getText().toString();

        intent.putExtra("tempat","EATBUS");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        menu = (EditText)findViewById(R.id.editText1);
        String makan = menu.getText().toString();

        jumlah = (EditText)findViewById(R.id.editText2);
        String porsi = jumlah.getText().toString();

        intent.putExtra("tempat","ABNORMAL");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "30000");
        startActivity(intent);
    }
}
