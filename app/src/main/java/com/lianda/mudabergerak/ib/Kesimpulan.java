package com.lianda.mudabergerak.ib;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class Kesimpulan extends AppCompatActivity {

    public static String KEY_ITEM = "item";

    private ImageView ivFotoKesimpulan;
    private TextView tvJudulKesimpulan;
    private TextView tvLinkKesimpulan;

    private KesimpulanModel item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesimpulan);

        ivFotoKesimpulan = (ImageView)findViewById(R.id.iv_fotoLihatKesimpulan);
        tvJudulKesimpulan = (TextView)findViewById(R.id.tv_judulLihatKesimpulan);
        tvLinkKesimpulan = (TextView)findViewById(R.id.tv_linkLihatKesimpulan);

        item = (KesimpulanModel)getIntent().getSerializableExtra(KEY_ITEM);

        ivFotoKesimpulan.setImageResource(item.getFotoKesimpulan());
        tvJudulKesimpulan.setText(item.getJudulKesimpulan());
        tvLinkKesimpulan.setText(item.getLinkKesimpulan());



    }
}
