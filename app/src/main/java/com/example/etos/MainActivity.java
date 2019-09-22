package com.example.etos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gigamole.library.PulseView;

public class MainActivity extends AppCompatActivity {
    //private Button button;
    PulseView pulseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // button = (Button)findViewById(R.id.translateButton);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), translate.class);
//                startActivity(intent);
//            }
//        });
        pulseView = (PulseView)findViewById(R.id.pv);
        pulseView.startPulse();
        pulseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), translate.class);
                startActivity(intent);
            }
        });
    }
}
