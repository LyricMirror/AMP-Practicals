package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText)findViewById(R.id.txt1);
        b1 = (Button)findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String data = t1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), DataReceive.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
    }
}