package com.mccarthy.kern.animalsounds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Instructions
    public void buttonOnClick(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), instructionsforapp.class));
    }
    //Page 1
    public void NextPage1(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), page1.class));
    }
}
