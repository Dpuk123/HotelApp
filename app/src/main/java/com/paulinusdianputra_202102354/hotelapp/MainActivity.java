package com.paulinusdianputra_202102354.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://awsimages.detik.net.id/community/media/visual/2022/12/06/pantai-melasti-desa-ungasan-badung-bali-yang-eksotis-dengan-hamparan-pasir-putih-dan-jajaran-tebing-kapurnya-yang-menawan_169.jpeg?w=1200";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}