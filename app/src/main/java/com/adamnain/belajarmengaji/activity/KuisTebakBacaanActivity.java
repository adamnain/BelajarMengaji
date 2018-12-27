package com.adamnain.belajarmengaji.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.adamnain.belajarmengaji.R;

public class KuisTebakBacaanActivity extends AppCompatActivity {
ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_bacaan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanHijaiyahActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanHarokatActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanTanwinActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonAbout);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonExit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
