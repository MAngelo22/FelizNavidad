package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Portal = (ImageView) findViewById(R.id.ImagenPortal);
        ImageView Sonic = (ImageView) findViewById(R.id.ImagenSonic);
        ImageView Mario = (ImageView) findViewById(R.id.ImagenMario);

        Animation animacionRotar = AnimationUtils.loadAnimation(this,R.anim.animrotar);
        Portal.startAnimation(animacionRotar);

        Animation animacionScale = AnimationUtils.loadAnimation(this,R.anim.animalpha);
        Sonic.startAnimation(animacionScale);

        Animation animacionScale2 = AnimationUtils.loadAnimation(this,R.anim.animup);
        Mario.startAnimation(animacionScale2);

        MediaPlayer mediaPlayer = MediaPlayer.create(  this, R.raw.last_christmas_8bits );
        mediaPlayer.start();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        ImageView Portal = (ImageView) findViewById(R.id.ImagenPortal);

        Animation animacionDes = AnimationUtils.loadAnimation(this,R.anim.animdes);
        Portal.startAnimation(animacionDes);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
