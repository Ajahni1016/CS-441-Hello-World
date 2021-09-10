package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button colorButton;
    Button styleButton;
    Button fontButton;
    Button startButton;
    Button backButton;
    Button rightButton;
    Button leftButton;
    // Color Screen
    TextView colorText;
    // Font Screen
    TextView fontText;
    // Style Screen
    TextView styleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = findViewById(R.id.hello_text);
        colorButton = findViewById(R.id.color_button);
        styleButton = findViewById(R.id.style_button);
        fontButton = findViewById(R.id.font_button);
        startButton = findViewById(R.id.start_button);
        backButton = findViewById(R.id.back_button);
        rightButton = findViewById(R.id.right_arrow);
        leftButton = findViewById(R.id.left_arrow);
        backButton.setVisibility(View.GONE);
        rightButton.setVisibility(View.GONE);
        leftButton.setVisibility(View.GONE);

        // Color Screen
        colorText = findViewById(R.id.color_text);
        colorText.setVisibility(View.GONE);

        // Font Screen
        fontText = findViewById(R.id.font_text);
        fontText.setVisibility(View.GONE);

        // Style Screen
        styleText = findViewById(R.id.style_text);
        styleText.setVisibility(View.GONE);



    }

    public void onColorClick(View view){
        colorButton.setVisibility(View.GONE);
        fontButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        colorText.setVisibility(View.VISIBLE);
        rightButton.setVisibility(View.VISIBLE);
        leftButton.setVisibility(View.VISIBLE);
    }

    public void onFontClick(View view){
        colorButton.setVisibility(View.GONE);
        fontButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        fontText.setVisibility(View.VISIBLE);
        rightButton.setVisibility(View.VISIBLE);
        leftButton.setVisibility(View.VISIBLE);
    }

    public void onStyleClick(View view){
        colorButton.setVisibility(View.GONE);
        fontButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        styleText.setVisibility(View.VISIBLE);
        rightButton.setVisibility(View.VISIBLE);
        leftButton.setVisibility(View.VISIBLE);
    }

    public void onBackClick(View view){
        colorButton.setVisibility(View.VISIBLE);
        fontButton.setVisibility(View.VISIBLE);
        styleButton.setVisibility(View.VISIBLE);
        startButton.setVisibility(View.VISIBLE);
        backButton.setVisibility(View.GONE);
        colorText.setVisibility(View.GONE);
        fontText.setVisibility(View.GONE);
        styleText.setVisibility(View.GONE);
        rightButton.setVisibility(View.GONE);
        leftButton.setVisibility(View.GONE);
    }

}