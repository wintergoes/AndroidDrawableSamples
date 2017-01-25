package com.bcoder.drawablesamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onOpenShapeSamples(View v){
        Intent intent = new Intent(this, ShapeActivity.class);
        startActivity(intent);
    }

    public void onOpenRoundRectBtn(View v){
        Intent intent = new Intent(this, RoundRectBtnActivity.class);
        startActivity(intent);
    }

    public void onOpenRoundRecOvaltBtn(View v){
        Intent intent = new Intent(this, RoundRectOvalBtnActivity.class);
        startActivity(intent);
    }

    public void onOpenLeafbtnActivity(View v){
        Intent intent = new Intent(this, LeafBtnActivity.class);
        startActivity(intent);
    }
}
