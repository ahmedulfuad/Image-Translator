package com.example.fuad.imagetranslator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopupActivity extends AppCompatActivity {

    private TextView TranslatedTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        TranslatedTextView = findViewById(R.id.translated_text_view);
        TranslatedTextView.setMovementMethod(new ScrollingMovementMethod());

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        // get data via the key
        String translatedtext = extras.getString("translatedtext");
        if (translatedtext != null) {
            // do something with the data
            TranslatedTextView.setText(translatedtext);
        }
    }
}
