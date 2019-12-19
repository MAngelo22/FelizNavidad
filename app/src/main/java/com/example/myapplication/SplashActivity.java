package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView texto = (TextView) findViewById(R.id.loading);
        ImageView Avatar = (ImageView) findViewById(R.id.ImagenAvatar);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.splashanim);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.animalpha);

        texto.startAnimation(animacion);
        Avatar.startAnimation(animacion2);

        animacion.setAnimationListener(this);

        MediaPlayer MP = MediaPlayer.create(this, R.raw.pato_donald_navidad);
        MP.start();

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent transicion = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(transicion);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
