package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button b1,b2,b3,b4,b5;
    TextView tv1;
    int n1=0,n2=0;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.btnAdd);
        b2 = (Button) findViewById(R.id.btnSub);
        b3 = (Button) findViewById(R.id.btnMult);
        b4 = (Button) findViewById(R.id.btnDiv);
        b5 = (Button) findViewById(R.id.btnClear);
        tv1 = (TextView) findViewById(R.id.tv1);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s1);
                    int sum = n1 + n2;
                    tv1.setText("Addition ="+sum);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s1);
                    int sub = n1 - n2;
                    tv1.setText("Subtraction ="+sub);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s1);
                    int m = n1 * n2;
                    tv1.setText("Multiplication ="+m);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s1);
                    int d = n1 / n2;
                    tv1.setText("Division ="+d);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(" ");
                t2.setText(" ");
                tv1.setText(" ");
            }
        });
    }
}