package com.calculator.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ad,su,mu,di,la,sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad=(Button)findViewById(R.id.add1);
        su=(Button)findViewById(R.id.sub1);
        mu=(Button)findViewById(R.id.mul1);ad=(Button)findViewById(R.id.add1);
        di=(Button)findViewById(R.id.div1);
        la=(Button)findViewById(R.id.largest);
        sm=(Button)findViewById(R.id.smallest);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Addition.class);
                startActivity(a);
            }
        });
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(getApplicationContext(),Subtraction.class);
                startActivity(s);
            }
        });
       mu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent m = new Intent(getApplicationContext(),Multiplication.class);
               startActivity(m);
           }
       });
        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(getApplicationContext(),Division.class);
                startActivity(d);
            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(),Largest.class);
                startActivity(l);
            }
        });
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sma = new Intent(getApplicationContext(),Smallest.class);
                startActivity(sma);
            }
        });
    }
}
