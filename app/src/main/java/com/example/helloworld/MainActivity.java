package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button colorButton;
    Button styleButton;
    Button sizeButton;
    Button startButton;
    Button backButton;

    // Color Screen
    TextView colorText;
    ImageButton rightColorButton;
    ImageButton leftColorButton;
    // Size Screen
    TextView sizeText;
    ImageButton rightSizeButton;
    ImageButton leftSizeButton;
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
        sizeButton = findViewById(R.id.size_button);
        startButton = findViewById(R.id.start_button);
        backButton = findViewById(R.id.back_button);
        rightSizeButton = findViewById(R.id.size_right_arrow);
        leftSizeButton = findViewById(R.id.size_left_arrow);
        rightColorButton = findViewById(R.id.color_right_arrow);
        leftColorButton = findViewById(R.id.color_left_arrow);
        rightStyleButton = findViewById(R.id.style_right_arrow);
        leftStyleButton = findViewById(R.id.style_left_arrow);
        backButton.setVisibility(View.GONE);
        rightSizeButton.setVisibility(View.GONE);
        leftSizeButton.setVisibility(View.GONE);
        rightColorButton.setVisibility(View.GONE);
        leftColorButton.setVisibility(View.GONE);
        rightStyleButton.setVisibility(View.GONE);
        leftStyleButton.setVisibility(View.GONE);

        // Color Screen
        colorText = findViewById(R.id.color_text);
        colorText.setVisibility(View.GONE);

        // Font Screen
        sizeText = findViewById(R.id.size_text);
        sizeText.setVisibility(View.GONE);

        // Style Screen
        styleText = findViewById(R.id.style_text);
        styleText.setVisibility(View.GONE);



    }

    int ColorFontStyle = 1;
    int ColorCounter = 1;
    int FontCounter = 1;
    int StyleCounter = 1;


    public void changeColor(View view){
        if(ColorCounter==1){
            helloText.setTextColor(Color.GRAY);
            colorText.setText("Gray");
        }
        else if(ColorCounter==2){
            helloText.setTextColor(Color.RED);
            colorText.setText("Red");
        }
        else if(ColorCounter==3){
            helloText.setTextColor(Color.BLUE);
            colorText.setText("Blue");
        }
        else if(ColorCounter==4){
            helloText.setTextColor(Color.YELLOW);
            colorText.setText("Yellow");
        }
        else if(ColorCounter==5){
            helloText.setTextColor(Color.GREEN);
            colorText.setText("Green");
        }
    }

    public void changeFont(View view){
        if(FontCounter==1){
            helloText.setTextSize(50);
            sizeText.setText("Medium");
        }
        else if(FontCounter==2){
            helloText.setTextSize(70);
            sizeText.setText("Large");
        }
        else if(FontCounter==3){
            helloText.setTextSize(30);
            sizeText.setText("Small");
        }
    }

    public void changeStyle(View view){
        if(StyleCounter==1){
            helloText.setTypeface(null,Typeface.NORMAL);
            styleText.setText("Normal");
        }
        else if(StyleCounter==2){
            helloText.setTypeface(null,Typeface.ITALIC);
            styleText.setText("Italic");
        }
        else if(StyleCounter==3){
            helloText.setTypeface(null,Typeface.BOLD);
            styleText.setText("Bold");
        }
    }

    public void onLeftClick(View view){
        if(ColorFontStyle==1){
            if(ColorCounter==1){
                ColorCounter=5;
            }
            else{
                ColorCounter--;
            }
            changeColor(view);
        }

        else if(ColorFontStyle==2){
            if(FontCounter==1){
                FontCounter=3;
            }
            else{
                FontCounter--;
            }
            changeFont(view);
        }

        else if(ColorFontStyle==3){
            if(StyleCounter==1){
                StyleCounter=3;
            }
            else{
                StyleCounter--;
            }
            changeStyle(view);
        }
    }

    public void onRightClick(View view){
        if(ColorFontStyle==1){
            if(ColorCounter==5){
                ColorCounter=1;
            }
            else{
                ColorCounter++;
            }
            changeColor(view);
        }
        else if(ColorFontStyle==2){
            if(FontCounter==3){
                FontCounter=1;
            }
            else{
                FontCounter++;
            }
            changeFont(view);
        }

        else if(ColorFontStyle==3){
            if(StyleCounter==3){
                StyleCounter=1;
            }
            else{
                StyleCounter++;
            }
            changeStyle(view);
        }
    }

    public void onColorClick(View view){
        ColorFontStyle = 1;
        colorButton.setVisibility(View.GONE);
        sizeButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        colorText.setVisibility(View.VISIBLE);
        rightColorButton.setVisibility(View.VISIBLE);
        leftColorButton.setVisibility(View.VISIBLE);
    }

    public void onFontClick(View view){
        ColorFontStyle = 2;
        colorButton.setVisibility(View.GONE);
        sizeButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        sizeText.setVisibility(View.VISIBLE);
        rightSizeButton.setVisibility(View.VISIBLE);
        leftSizeButton.setVisibility(View.VISIBLE);
    }

    public void onStyleClick(View view){
        ColorFontStyle = 3;
        colorButton.setVisibility(View.GONE);
        sizeButton.setVisibility(View.GONE);
        styleButton.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        styleText.setVisibility(View.VISIBLE);
        rightStyleButton.setVisibility(View.VISIBLE);
        leftStyleButton.setVisibility(View.VISIBLE);
    }

    public void onBackClick(View view){
        colorButton.setVisibility(View.VISIBLE);
        sizeButton.setVisibility(View.VISIBLE);
        styleButton.setVisibility(View.VISIBLE);
        startButton.setVisibility(View.VISIBLE);
        backButton.setVisibility(View.GONE);
        colorText.setVisibility(View.GONE);
        sizeText.setVisibility(View.GONE);
        styleText.setVisibility(View.GONE);
        rightSizeButton.setVisibility(View.GONE);
        leftSizeButton.setVisibility(View.GONE);
        rightColorButton.setVisibility(View.GONE);
        leftColorButton.setVisibility(View.GONE);
        rightStyleButton.setVisibility(View.GONE);
        leftStyleButton.setVisibility(View.GONE);
    }

}