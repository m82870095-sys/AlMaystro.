package com.almaystro.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView welcome = new TextView(this);
        welcome.setText("المايسترو\n\nهتتعلم التاريخ ببساطة");
        welcome.setTextSize(28);
        welcome.setTextColor(Color.WHITE);
        welcome.setGravity(Gravity.CENTER);
        welcome.setPadding(30, 30, 30, 30);
        welcome.setBackgroundColor(Color.rgb(20, 70, 50));

        setContentView(welcome);
    }
}
