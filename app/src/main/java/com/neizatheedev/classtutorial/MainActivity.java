package com.neizatheedev.classtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.neizatheedev.classtutorial.Activities.MainMenuActivity;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Monday September 2023
 * @Time: 10:09 PM
 */
public class MainActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private CheckBox rememberMe;
    private MaterialButton loginBtn;
    private ImageView facebookIcon, githubIcon, twitterIcon;
    private TextView forgotPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = (EditText) findViewById(R.id.emailInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);

        rememberMe = (CheckBox) findViewById(R.id.rememberMe);

        loginBtn = (MaterialButton) findViewById(R.id.loginBtn);

        facebookIcon = (ImageView) findViewById(R.id.facebookIcon);
        githubIcon = (ImageView) findViewById(R.id.githubIcon);
        twitterIcon = (ImageView) findViewById(R.id.twitterIcon);

        forgotPass = (TextView) findViewById(R.id.forgotPass);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDashboard();
            }
        });
    }

    public void methodMessage(){
        String github = "Github";
        String facebook = "Facebook";
        String Twitter = facebookIcon.toString().trim();

        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void goToDashboard(){
        Intent x = new Intent(MainActivity.this, MainMenuActivity.class);
        startActivity(x);
    }
}