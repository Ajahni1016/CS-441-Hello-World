package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button colorButton;
    Button styleButton;
    Button fontButton;
    Button startButton;
    Button backButton;

    // Color Screen
    TextView colorText;
    ImageButton rightColorButton;
    ImageButton leftColorButton;
    // Font Screen
    TextView fontText;
    ImageButton rightFontButton;
    ImageButton leftFontButton;
    // Style Screen
    TextView styleText;
    ImageButton rightStyleButton;
    ImageButton leftStyleButton;

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
        rightFontButton = findViewById(R.id.font_right_arrow);
        leftFontButton = findViewById(R.id.font_left_arrow);
        rightColorButton = findViewById(R.id.color_right_arrow);
        leftColorButton = findViewById(R.id.color_left_arrow);
        rightStyleButton = findViewById(R.id.style_right_arrow);
        leftStyleButton = findViewById(R.id.style_left_arrow);
        backButton.setVisibility(View.GONE);
        rightFontButton.setVisibility(View.GONE);
        leftFontButton.setVisibility(View.GONE);
        rightColorButton.setVisibility(View.GONE);
        leftColorButton.setVisibility(View.GONE);
        rightStyleButton.setVisibility(View.GONE);
        leftStyleButton.setVisibility(View.GONE);

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
        rightColorButton.setVisibility(View.VISIBLE);
        leftColorButton.setVisibility(View.VISIBLE);
    }

    public void onFontClick(View view){
        colorButton.setVisibility(View.GONE);
        fontButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        fontText.setVisibility(View.VISIBLE);
        rightFontButton.setVisibility(View.VISIBLE);
        leftFontButton.setVisibility(View.VISIBLE);
    }

    public void onStyleClick(View view){
        colorButton.setVisibility(View.GONE);
        fontButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        styleText.setVisibility(View.VISIBLE);
        rightStyleButton.setVisibility(View.VISIBLE);
        leftStyleButton.setVisibility(View.VISIBLE);
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
        rightFontButton.setVisibility(View.GONE);
        leftFontButton.setVisibility(View.GONE);
        rightColorButton.setVisibility(View.GONE);
        leftColorButton.setVisibility(View.GONE);
        rightStyleButton.setVisibility(View.GONE);
        leftStyleButton.setVisibility(View.GONE);
    }

}