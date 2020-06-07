package com.example.ex013;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout background;
    boolean on;
    int times,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background=(LinearLayout) findViewById(R.id.background);
        on=false;
        times=0;
    }
    public void on_off(View view) {
        on=true;
        times++;
        if(times==2){
            on=false;
            times=0;
        }
        suggestion();
    }
    public void colors(){
        switch (op) {
            case 1:
                background.setBackgroundColor(Color.RED);
                break;
            case 2:
                background.setBackgroundColor(Color.CYAN);
                break;
            case 3:
                background.setBackgroundColor(Color.MAGENTA);
                break;
            case 4:
                background.setBackgroundColor(Color.GREEN);
                break;
        }
    }
    public void suggestion() {
        if (on) {
            colors();
        }
    }
    public void btn_red(View view) {
         op=1;
         suggestion();
    }

    public void btn_ltblue(View view) {
        op= 2;
        suggestion();
    }

    public void btn_purple(View view) {
        op= 3;
        suggestion();
    }

    public void btn_green(View view) {
        op=4;
        suggestion();
    }

    public void change(View view) {
        colors();
    }
}