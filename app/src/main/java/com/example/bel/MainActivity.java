package com.example.bel;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton grocery;
    ImageButton delivery;
    ImageButton entertain;
    ImageButton taxi;
    ImageButton homeAuto;
    ImageButton locator;
    ImageButton pharma;
    ImageButton health;
    ImageButton ev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#000000"));

        actionBar.setBackgroundDrawable(colorDrawable);


        grocery = (ImageButton) findViewById(R.id.grocery);
        delivery = (ImageButton) findViewById(R.id.delivery);
        entertain = (ImageButton) findViewById(R.id.entertainment);
        taxi = (ImageButton) findViewById(R.id.taxi);
        homeAuto = (ImageButton) findViewById(R.id.home_auto);
        locator = (ImageButton) findViewById(R.id.locator);
        pharma = (ImageButton) findViewById(R.id.pharma);
        health = (ImageButton) findViewById(R.id.health);
        ev = (ImageButton) findViewById(R.id.ev);


        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,  allGroceries.class);
                startActivity(i);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,  allDeliveries.class);
                startActivity(i);
            }
        });


        pharma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, allPharma.class);
                startActivity(i);
            }
        });


        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, allTaxi.class);
                startActivity(i);
            }
        });

        homeAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, allAuto.class);
                startActivity(i);
            }
        });

        locator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                PackageManager managerclock = getPackageManager();
                i = managerclock.getLaunchIntentForPackage("com.thetileapp.tile");
                i.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(i);
            }
        });

        entertain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, allEntertainment.class);
                startActivity(i);
            }
        });


        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, allEv.class);
                startActivity(i);
            }
        });
    }

}
