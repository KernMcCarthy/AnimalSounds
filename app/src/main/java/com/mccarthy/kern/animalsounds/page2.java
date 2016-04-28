package com.mccarthy.kern.animalsounds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    //mediaplayer
    MediaPlayer HorseMP;
    MediaPlayer MonkeyMP;
    MediaPlayer BirdMP;
    MediaPlayer ElephantMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        //code for Cat button
        HorseMP = MediaPlayer.create(this, R.raw.horse);
        MonkeyMP = MediaPlayer.create(this, R.raw.monkey);
        BirdMP = MediaPlayer.create(this, R.raw.bird);
        ElephantMP = MediaPlayer.create(this, R.raw.elephant);}
    //code for Horse button
    public void playHorse(View view) {HorseMP.start();}

    //code for Monkey button
    public void playMonkey(View view) {MonkeyMP.start();}

    //code for Bird button
    public void playBird(View view) {BirdMP.start();}

    //code for Elephant button
    public void playElephant(View view) {ElephantMP.start();}

    //Home button code
    public void ReturnHome(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}