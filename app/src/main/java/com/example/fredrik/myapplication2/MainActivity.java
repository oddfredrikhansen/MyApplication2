package com.example.fredrik.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        EditText et = (EditText)findViewById(R.id.editText1);
        Toast.makeText(getApplicationContext(), "Welcome " +et.getText().toString(), Toast.LENGTH_LONG).show();
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.pippi_org2);
        Log.i("Text value: ", et.getText().toString());
        et.setText("");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
