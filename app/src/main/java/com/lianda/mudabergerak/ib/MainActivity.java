package com.lianda.mudabergerak.ib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton menu1,menu2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        menu1 = (FloatingActionButton)findViewById(R.id.subFloatingBuatArtikel) ;
        menu2 = (FloatingActionButton)findViewById(R.id.subFloatingBuatKesimpulan) ;

        menu1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

               Intent artikel = new Intent (getApplicationContext(), ArtikelInput.class);
               startActivity(artikel);

                }
                });

                menu2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent kesimpulan = new Intent (getApplicationContext(), KesimpulanInput.class);
            startActivity(kesimpulan);

                }
                });
    }

    public void detailKesimpulan(View view) {
        Intent detail = new Intent (getApplicationContext(), Kesimpulan.class);
        startActivity(detail);
    }

    public void diskusi (View view) {
        Intent diskusi = new Intent (getApplicationContext(), ArtikelDetail.class);
        startActivity(diskusi);
    }


}
