package com.almaystro.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // الخلفية الرئيسية: أخضر غامق
        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{
                        Color.rgb(7, 45, 32),
                        Color.rgb(18, 82, 57),
                        Color.rgb(7, 45, 32)
                }
        );

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER);
        mainLayout.setPadding(35, 40, 35, 40);
        mainLayout.setBackground(background);

        // زخرفة علوية
        TextView decorationTop = new TextView(this);
        decorationTop.setText("✦  ❖  ✦  ❖  ✦");
        decorationTop.setTextSize(26);
        decorationTop.setTextColor(Color.rgb(212, 175, 55));
        decorationTop.setGravity(Gravity.CENTER);
        mainLayout.addView(decorationTop);

        // اسم التطبيق
        TextView title = new TextView(this);
        title.setText("المايسترو");
        title.setTextSize(42);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.rgb(230, 194, 70));
        title.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams titleParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        titleParams.setMargins(0, 35, 0, 15);
        mainLayout.addView(title, titleParams);

        // العبارة
        TextView subtitle = new TextView(this);
        subtitle.setText("هتتعلم التاريخ ببساطة");
        subtitle.setTextSize(21);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        mainLayout.addView(subtitle);

        // زخرفة وسطية
        TextView decorationMiddle = new TextView(this);
        decorationMiddle.setText("❖");
        decorationMiddle.setTextSize(32);
        decorationMiddle.setTextColor(Color.rgb(212, 175, 55));
        decorationMiddle.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams middleParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        middleParams.setMargins(0, 35, 0, 25);
        mainLayout.addView(decorationMiddle, middleParams);

        // زر ابدأ الآن
        Button startButton = new Button(this);
        startButton.setText("ابدأ الآن");
        startButton.setTextSize(20);
        startButton.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        startButton.setTextColor(Color.rgb(7, 45, 32));

        GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(Color.rgb(224, 190, 70));
        buttonBackground.setCornerRadius(30);

        startButton.setBackground(buttonBackground);
        startButton.setPadding(40, 15, 40, 15);

        LinearLayout.LayoutParams buttonParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        buttonParams.setMargins(45, 10, 45, 10);
        mainLayout.addView(startButton, buttonParams);

        // زخرفة سفلية
        TextView decorationBottom = new TextView(this);
        decorationBottom.setText("✦  ❖  ✦");
        decorationBottom.setTextSize(24);
        decorationBottom.setTextColor(Color.rgb(212, 175, 55));
        decorationBottom.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams bottomParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        bottomParams.setMargins(0, 30, 0, 0);
        mainLayout.addView(decorationBottom, bottomParams);

        setContentView(mainLayout);
    }
}
