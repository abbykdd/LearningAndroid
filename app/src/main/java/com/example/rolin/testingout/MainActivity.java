package com.example.rolin.testingout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean isRed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        Toast.makeText(getApplication().getBaseContext(), "Black's turn", Toast.LENGTH_SHORT).show();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getTag().toString();
                if(!isRed){
                    ((Button) view).setBackgroundColor(Color.BLACK);
                    Toast.makeText(getApplication().getBaseContext(), "Red's turn", Toast.LENGTH_SHORT).show();
                } else {
                    ((Button) view).setBackgroundColor(Color.RED);
                    Toast.makeText(getApplication().getBaseContext(), "Black's turn", Toast.LENGTH_SHORT).show();
                }
                isRed = !isRed;
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);

//        leftButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((Button) view).setBackgroundColor(Color.RED);
//                rightButton.setBackgroundColor(Color.GRAY);
//                ((Button) view).setText("selected");
//                rightButton.setText("not-selected");
//                Toast.makeText(getApplicationContext(), "you clicked left button", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        rightButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((Button) view).setBackgroundColor(Color.RED);
//                leftButton.setBackgroundColor(Color.GRAY);
//                ((Button)view).setText("selected");
//                leftButton.setText("not-selected");
//                Toast.makeText(getApplicationContext(), "you clicked right button", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
