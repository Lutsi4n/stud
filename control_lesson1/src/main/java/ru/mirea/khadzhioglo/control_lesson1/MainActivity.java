package ru.mirea.khadzhioglo.control_lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = findViewById(R.id.textView5);  // для activity_second
        TextView myTextView = (TextView) findViewById(R.id.textView5);  // для activity_second
        myTextView.setText("New text in MIREA");  // для activity_second

        Button button = findViewById(R.id.button7);  // для activity_second
        button.setText("MireaButton");  // для activity_second


    }
}