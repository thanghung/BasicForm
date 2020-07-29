package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton nam, nu;
    EditText ten, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nam = (RadioButton) findViewById(R.id.nam);
        nu = (RadioButton) findViewById(R.id.nu);
        ten = (EditText) findViewById(R.id.ten);
        email = (EditText) findViewById(R.id.email);
    }

    public void display(View v)
    {
        String a;
        a= "Tên: " + ten.getText().toString() + "\n";
        a+= "Email: " + email.getText().toString() + "\n";

        if(nam.isChecked() == true)
            a += "Giới tính: " + nam.getText().toString();
        else
            a+="Giới tính: " +  nu.getText().toString();
        Toast.makeText(MainActivity.this,a,
                Toast.LENGTH_SHORT).show();
    }

    public void  Huy(View v)
    {
        Toast.makeText(MainActivity.this,"Đã hủy",
                Toast.LENGTH_SHORT).show();
    }
}
