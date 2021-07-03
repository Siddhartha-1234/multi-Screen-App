package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    private Button button;
    public static final String Msg= "com.example.multiscreenapp.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = findViewById(R.id.button);

    }
    public void PLaceOrder(View view)
    {
        Intent i = new Intent(this, OrderAct.class);
        EditText editText1;
        EditText editText2;
        EditText editText3;
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        String tell ="Order for " +  editText1.getText().toString() + " , " + editText2.getText().toString() + " , " + editText3.getText().toString() + " has been succesfully placed.";
        i.putExtra(Msg, tell);
        startActivity(i);
    }
}