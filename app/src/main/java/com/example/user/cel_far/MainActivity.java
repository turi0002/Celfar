package com.example.user.cel_far;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends Activity implements My_dialog.ResultsListener{
    RadioButton r1;
    RadioButton r2;
    Button b1;
    RadioGroup rg1;
    TextView tv1;
    TextView tv2;
    EditText et1;
    EditText et2;
    int registerCode =1;
    Toolbar tb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1 = findViewById(R.id.toolbar);
        tb1.setLogo(R.mipmap.ic_launcher_round);
        setActionBar(tb1);
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
                        et1.setEnabled(true);
                        et2.setEnabled(true);
                    }
                    else
                        b1.setEnabled(false);
                        et1.setEnabled(true);
                        et2.setEnabled(true);
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
    } {
}
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.manu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.setting:
                Context context = getApplicationContext();
                CharSequence text = "setting push";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                return true;
            case R.id.help:
                Context context1 = getApplicationContext();
                CharSequence text2 = "help please";
                int duration2 = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context1, text2, duration2);
                toast1.show();
                return true;
            case R.id.exit:
               My_dialog.newInstance(My_dialog.EXIT_DIALOG).show(getFragmentManager(), "Exit dialog");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onFinishDialog(int requestCod, Object results) {

    }
}
