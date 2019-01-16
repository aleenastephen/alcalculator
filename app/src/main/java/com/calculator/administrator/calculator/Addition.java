package com.calculator.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addition extends AppCompatActivity {
EditText e1,e2,e3;
    Button b,b1;
    String s1,s2,s3,s4;
    Integer num1,num2,num3,num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        e1=(EditText)findViewById(R.id.anum1);
        e2=(EditText)findViewById(R.id.anum2);
        e3=(EditText)findViewById(R.id.anum3);
        b=(Button)findViewById(R.id.addition);
        b1=(Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                num1=Integer.parseInt(s1);
                num2=Integer.parseInt(s2);
                num3=Integer.parseInt(s3);
                num4=num1+num2+num3;
                s4=String.valueOf(num4);
                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back1= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(back1);
            }
        });


    }
}
