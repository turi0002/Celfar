package com.example.user.cel_far;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

    }
           public void onClicked(){

    }
}
