package com.lianda.mudabergerak.ib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtikelDetail extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_detail);



    }

    public void kembali (View view) {
        Intent back = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(back);
    }
}
