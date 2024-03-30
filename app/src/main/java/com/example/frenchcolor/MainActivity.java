package com.example.frenchcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedbtnid = v.getId();
        if (clickedbtnid == R.id.button) {
            PlaySound(R.raw.pink);
        } else if (clickedbtnid == R.id.button2) {
            PlaySound(R.raw.red);

        } else if (clickedbtnid == R.id.button3) {
            PlaySound(R.raw.green);

        } else if (clickedbtnid == R.id.button4) {
            PlaySound(R.raw.yellow);
        }
    }
    public void PlaySound(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(
                this,
                id);
        mediaPlayer.start();

    }
}
