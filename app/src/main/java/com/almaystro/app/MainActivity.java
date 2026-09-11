package com.almaystro.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // الخلفية
        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{
                        Color.rgb(5, 38, 27),
                        Color.rgb(14, 70, 48),
                        Color.rgb(5, 38, 27)
                }
        );

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER);
        mainLayout.setPadding(30, 35, 30, 35);
        mainLayout.setBackground(background);

        // الزخرفة العلوية
        TextView top = new TextView(this);
        top.setText("✦  ❖  ✦");
        top.setTextSize(25);
        top.setTextColor(Color.rgb(224, 190, 70));
        top.setGravity(Gravity.CENTER);
        mainLayout.addView(top);

        // الصورة
        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.maestro);
        logo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        LinearLayout.LayoutParams imageParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        280
                );
        imageParams.setMargins(0, 20, 0, 10);
        mainLayout.addView(logo, imageParams);

        // اسم التطبيق
        TextView title = new TextView(this);
        title.setText("المايسترو");
        title.setTextSize(40);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.rgb(230, 194, 70));
        title.setGravity(Gravity.CENTER);
        mainLayout.addView(title);

        // اسم المدرس
        TextView teacher = new TextView(this);
        teacher.setText("المايسترو شريف هيبه");
        teacher.setTextSize(22);
        teacher.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        teacher.setTextColor(Color.WHITE);
        teacher.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams teacherParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        teacherParams.setMargins(0, 8, 0, 5);
        mainLayout.addView(teacher, teacherParams);

        // العبارة
        TextView subtitle = new TextView(this);
        subtitle.setText("هتتعلم التاريخ ببساطة");
        subtitle.setTextSize(19);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        mainLayout.addView(subtitle);

        // الزخرفة
        TextView middle = new TextView(this);
        middle.setText("❖");
        middle.setTextSize(28);
        middle.setTextColor(Color.rgb(224, 190, 70));
        middle.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams middleParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        middleParams.setMargins(0, 20, 0, 15);
        mainLayout.addView(middle, middleParams);

        // زر ابدأ الآن
        Button startButton = new Button(this);
        startButton.setText("ابدأ الآن");
        startButton.setTextSize(20);
        startButton.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        startButton.setTextColor(Color.rgb(5, 38, 27));

        GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(Color.rgb(224, 190, 70));
        buttonBackground.setCornerRadius(40);

        startButton.setBackground(buttonBackground);

        LinearLayout.LayoutParams buttonParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        65
                );
        buttonParams.setMargins(45, 5, 45, 5);
        mainLayout.addView(startButton, buttonParams);

        // الزخرفة السفلية
        TextView bottom = new TextView(this);
        bottom.setText("✦  ❖  ✦");
        bottom.setTextSize(22);
        bottom.setTextColor(Color.rgb(224, 190, 70));
        bottom.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams bottomParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        bottomParams.setMargins(0, 20, 0, 0);
        mainLayout.addView(bottom, bottomParams);

        setContentView(mainLayout);
    }
    }
