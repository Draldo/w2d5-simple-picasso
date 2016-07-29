package com.example.admin.picassoexample;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity{

    private ImageView imageView;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view) {

        imageView = (ImageView) findViewById(R.id.a_main_imgvw);
        imageView2 = (ImageView) findViewById(R.id.a_main_imgvw2);

        Picasso
                .with(this)
                .load("http://www.gammerson.com/wp-content/uploads/2016/07/SrL1GaG.jpg")
                .into(imageView);

        GlideDrawableImageViewTarget gitImage = new GlideDrawableImageViewTarget(imageView2);
        Glide
                .with(this)
                .load("http://vignette4.wikia.nocookie.net/narutofanon/images/6/62/Sharingan_eyes.gif")
                .into(gitImage);
    }
}

