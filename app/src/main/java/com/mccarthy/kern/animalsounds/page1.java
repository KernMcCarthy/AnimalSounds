package com.mccarthy.kern.animalsounds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    //mediaplayer
    MediaPlayer CatMP;
    MediaPlayer DogMP;
    MediaPlayer CowMP;
    MediaPlayer SheepMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        //mediaplayers
        CatMP = MediaPlayer.create(this, R.raw.cat);
        DogMP = MediaPlayer.create(this, R.raw.dog);
        CowMP = MediaPlayer.create(this, R.raw.cow);
        SheepMP = MediaPlayer.create(this, R.raw.sheep);}

    //code for Cat button
    public void playCat(View view) {CatMP.start();}

    //code for Dog button
    public void playDog(View view) {DogMP.start();}

    //code for Cow button
    public void playCow(View view) {CowMP.start();}

    //code for Sheep button
    public void playSheep(View view) {SheepMP.start();}

    //code for next button
    public void NextPage2(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), page2.class));
    }
}
