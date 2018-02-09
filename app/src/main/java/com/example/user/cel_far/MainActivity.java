package com.example.user.cel_far;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    RadioButton r1;
    RadioButton r2;
    Button b1;
    RadioGroup rg1;
    TextView tv1;
    TextView tv2;
    EditText et1;
    EditText et2;
    int registerCode =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);
        b1 = (Button) findViewById(R.id.bt1);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        rg1 = findViewById(R.id.radio_group);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (r1.isChecked()) {
                    if (et1.getText().toString().length()>0 && et2.getText().toString().length()>0) {
                    b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                }
                if(r2.isChecked()){
                    if (et1.getText().toString().length()>0 ||  et2.getText().toString().length()>0){
                        b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                    if(r1.isChecked()  && r2.isChecked() ) {
                        et1.setEnabled(false);
                        et2.setEnabled(false);
                    }
                        else{
                        et1.setEnabled(true);
                        et2.setEnabled(true);
                    }
                }

            }
        });
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (r1.isChecked()) {
                    if (et1.getText().toString().length()>0 && et2.getText().toString().length()>0) {
                        b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                }
                if(r2.isChecked()){
                    if (et1.getText().toString().length()>0 ||  et2.getText().toString().length()>0){
                        b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                    if(r1.isChecked()  && r2.isChecked() ) {
                        et1.setEnabled(false);
                        et2.setEnabled(false);
                    }
                    else{
                        et1.setEnabled(true);
                        et2.setEnabled(true);
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (r1.isChecked()) {
                    if (et1.getText().toString().length()>0 && et2.getText().toString().length()>0) {
                        b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                }
                if(r2.isChecked()){
                    if (et1.getText().toString().length()>0 ||  et2.getText().toString().length()>0){
                        b1.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                    if(r1.isChecked()  && r2.isChecked() ) {
                        et1.setEnabled(false);
                        et2.setEnabled(false);
                    }
                    else{
                        et1.setEnabled(true);
                        et2.setEnabled(true);
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
          b1.setOnClickListener(new View.OnClickListener() {


              @Override
              public void onClick(View view) {
                  if(r2.isChecked()) {
                      Intent i = new Intent(MainActivity.this, Cel_far_2.class);
                      i.putExtra("content1", et1.getText().toString());
                      i.putExtra("content3","Calculate");
                      startActivityForResult(i, registerCode);
                  }
                  else if(r1.isChecked()){
                      Intent i = new Intent(MainActivity.this, Cel_far_2.class);
                      i.putExtra("content1", et1.getText().toString());
                      i.putExtra("content2", et2.getText().toString());
                      i.putExtra("content3","check");
                      startActivityForResult(i, registerCode);
                  }
              }
          });
    }

           public void onClicked(){
            int x;
    }
}
