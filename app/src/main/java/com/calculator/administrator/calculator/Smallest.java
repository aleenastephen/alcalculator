package com.calculator.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Smallest extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b,b1;
    String n1,n2,n3;
    Integer num1,num2,num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smallest);
        e1=(EditText)findViewById(R.id.snum1);
        e2=(EditText)findViewById(R.id.snum2);
        e3=(EditText)findViewById(R.id.snum3);
        b=(Button)findViewById(R.id.small);
        b1=(Button)findViewById(R.id.b6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=e1.getText().toString();
                n2=e2.getText().toString();
                n3=e3.getText().toString();
                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);
                num3=Integer.parseInt(n3);
                if((num1<num2) && (num1<num3) ){

                    Toast.makeText(getApplicationContext(),n1,Toast.LENGTH_LONG).show();

                }
                else if ((num2<num1) && (num2<num3)){

                    Toast.makeText(getApplicationContext(),n2,Toast.LENGTH_LONG).show();
                }
                else{

                    Toast.makeText(getApplicationContext(),n3,Toast.LENGTH_LONG).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back6= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(back6);
            }
        });
    }
}
