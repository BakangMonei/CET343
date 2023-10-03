package com.neizatheedev.classtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Monday 19 September 2023
 * @Time: 1109 AM
 */
public class MainMenuActivity extends AppCompatActivity {
    ImageView bmi_imageview;
    TextView bmi_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        bmi_imageview = (ImageView) findViewById(R.id.bmi_imageview);
        bmi_textview = (TextView) findViewById(R.id.bmi_textview);

        bmi_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBMICalculator();
            }
        });
        bmi_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBMICalculator();
            }
        });

    }

    public void goToBMICalculator(){
        Intent x = new Intent(MainMenuActivity.this, BMIActivity.class);
        startActivity(x);
    }
}