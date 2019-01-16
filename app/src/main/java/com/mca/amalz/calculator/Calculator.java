package com.mca.amalz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);
        b5=(Button)findViewById(R.id.large);
        b6=(Button)findViewById(R.id.small);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(),add.class);
            startActivity(i);
        }
    });
  b2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent k=new Intent(getApplicationContext(),Sub.class);
          startActivity(k);
      }
  });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),Multiplication.class);
                startActivity(k);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),Div.class);
                startActivity(k);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),Largest.class);
                startActivity(k);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),Smallest.class);
                startActivity(k);
            }
        });
    }
}
