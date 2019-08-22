package com.example.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextView textView;
    Button  button;
    TextToSpeech TTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_input);
        button = findViewById(R.id.Tospeech);

        TTS= new TextToSpeech(MainActivity.this,this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text = textView.getText().toString();
                TTS.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }

    @Override
    public void onInit(int status) {

    }
}
