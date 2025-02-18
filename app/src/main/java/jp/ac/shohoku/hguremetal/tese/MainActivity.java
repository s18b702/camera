package jp.ac.shohoku.hguremetal.tese;

import androidx.appcompat.app.AppCompatActivity;
//AndroidX

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.media.SoundPool;


public class MainActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1000;
    private ImageView imageView;

    // サウンドの部分
    SoundPool soundPool;
    MediaPlayer player;
    int mp3a;
    int mp3b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sendButton = findViewById(R.id.hazimerubutton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
            }
        });

        Button sendButton2 = findViewById(R.id.asobikatabutton);
        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity2.class);
                startActivity(intent);
            }
        });
        





        // サウンドの部分(BGM)
        MediaPlayer Player = MediaPlayer.create(this, R.raw.bgm);
        Player.start();
        Player.setLooping(true);







    }







}
