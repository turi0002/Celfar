package com.example.user.cel_far;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class Cel_far_2 extends Activity {
int registerCode =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_far_2);
        Button b1 = findViewById(R.id.button);
        TextView tv1 = findViewById(R.id.tv1);
        Intent i = getIntent();
        String type = i.getStringExtra("content3");


        if(type.compareTo("check")==0) {
            Double get1= Double.parseDouble(i.getStringExtra("content1"));
            Double  get2= Double.parseDouble(i.getStringExtra("content2"));
            if (get1 == (get2 * 1.8 + 32)) {

                tv1.setText("bravo!, the temperature " + get1 + "c, is indeed " + get2 + "F");
            } else {
                tv1.setText("Oops!, you answer is wrong, you may try again ");
            }
        }
        else if (type.compareTo("Calculate")==0){
            Double get1= Double.parseDouble(i.getStringExtra("content1"));
            tv1.setText("the temprature "+get1+"F, is converted to "+(get1-32)*5/9);
        }
        b1.setOnClickListener();
        }
    }


