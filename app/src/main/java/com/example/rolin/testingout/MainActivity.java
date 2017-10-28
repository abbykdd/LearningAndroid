package com.example.rolin.testingout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button leftButton = findViewById(R.id.left_button);
        final Button rightButton = findViewById(R.id.right_button);

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Button) view).setBackgroundColor(Color.RED);
                rightButton.setBackgroundColor(Color.GRAY);
                ((Button) view).setText("selected");
                rightButton.setText("not-selected");
                Toast.makeText(getApplicationContext(), "you clicked left button", Toast.LENGTH_SHORT).show();
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Button) view).setBackgroundColor(Color.RED);
                leftButton.setBackgroundColor(Color.GRAY);
                ((Button)view).setText("selected");
                leftButton.setText("not-selected");
                Toast.makeText(getApplicationContext(), "you clicked right button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
