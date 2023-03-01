package ru.mirea.khadzhioglo.typelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvMirea;
    private Button btnChangeMireatext;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                tvMirea = findViewById(R.id.textViewNewMirea);
        btnChangeMireatext = findViewById(R.id.buttonChangeMireaText);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMirea.setText(String.format("Click_number: ", count++));
//                tvNewCounter.setText("NULLLL");
            }
        };
        btnChangeMireatext.setOnClickListener(onClickListener);
    }
    public void onClickButton(View view) {
//        tvNewCounter.setText(String.format("It's new clicker"));
        tvMirea.setText("NULLLLLL");
    }
}