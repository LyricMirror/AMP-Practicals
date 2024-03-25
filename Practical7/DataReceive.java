package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class DataReceive extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedIInstanceState){
        super.onCreate(savedIInstanceState);
        setContentView(R.layout.activity_data_receive);
        t1 = (TextView)findViewById(R.id.tv1);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        t1.setText(data);
    }
}
