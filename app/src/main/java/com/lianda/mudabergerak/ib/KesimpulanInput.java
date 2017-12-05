package com.lianda.mudabergerak.ib;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class KesimpulanInput extends AppCompatActivity {

    public ImageView ivImageKesimpulan;
    TextView tvJudulKesimpulan, tvLinkKesimpulan;
    Button btnSubmitKesimpulan;
    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesimpulan_input);

        ivImageKesimpulan = (ImageView)findViewById(R.id.iv_fotoKesimpulan);
        tvJudulKesimpulan = (TextView)findViewById(R.id.tv_judulKesimpulan);
        tvLinkKesimpulan = (TextView)findViewById(R.id.tv_linkKesimpulan);

        btnSubmitKesimpulan = (Button)findViewById(R.id.btn_SubmitKesimpulan);

    }

    public void diskusi (View view) {
        Intent kesimpulan = new Intent (getApplicationContext(), Kesimpulan.class);

        kesimpulan.putExtra("foto", ivImageKesimpulan.getId());
        kesimpulan.putExtra("judul", tvJudulKesimpulan.getText());
        kesimpulan.putExtra("link", tvLinkKesimpulan.getText());

        startActivity(kesimpulan);
    }

    public void cameraKesimpulan(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    public void galleryKesimpulan(View view)
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"),SELECT_FILE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE)
                onSelectFromGalleryResult(data);
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) {
        Bitmap bm=null;
        if (data != null) {
            try {
                bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ivImageKesimpulan.setImageBitmap(bm);
    }

    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");
        FileOutputStream fo;
        try {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ivImageKesimpulan.setImageBitmap(thumbnail);
    }



}
