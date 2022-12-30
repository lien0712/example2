package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCount ;
    TextView txtCount;
    int mCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCount=findViewById(R.id.button_count);
        txtCount= findViewById(R.id.show_count);
        btnCount.setOnClickListener(view -> {
            //Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT).show();
            //txtCount.setText("12");
            mCount++;
            txtCount.setText(""+mCount);
        });

    }

    public void showToast(View view) {
        mCount=0;
        txtCount.setText("0");

    }
}