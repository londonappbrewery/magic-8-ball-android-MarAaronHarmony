package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare the button
        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);

        //declare the image holder
        final ImageView myImage = (ImageView) findViewById(R.id.image_eightBall);

        //declare the array that holds images
        final int[] images = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ranGen = new Random();
                int ran = ranGen.nextInt(4);

                myImage.setImageResource(images[ran]);
            }
        });






    }
}
