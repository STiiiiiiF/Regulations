package com.example.regulations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSP70;
    Button btnSP48;
    Button btnSP63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSP70 = findViewById(R.id.btnSP70);
        btnSP48 = findViewById(R.id.btnSP48);
        btnSP63 = findViewById(R.id.btnSP63);

        btnSP70.setOnClickListener(this);
        btnSP48.setOnClickListener(this);
        btnSP63.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnSP70:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gusn.mosreg.ru/deyatelnost/knd/gosudarstvennyy-stroitelnyy-nadzor/normativno-pravovye-akty-soderzhashie-obyazatelnye-trebovaniya/14-09-2018-12-48-10-sp-70-13330-2012-nesushchie-i-ograzhdayushchie-kon"));
                startActivity(intent);
                break;
            case R.id.btnSP48:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ispolnitelnaya.ru/normativdocs/SP/SP%2048.13330.2019.html"));
                startActivity(intent);
                break;
            case R.id.btnSP63:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sniprf.ru/sp63-13330-2018"));
                startActivity(intent);
                break;
        }

    }
}