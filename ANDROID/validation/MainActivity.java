package com.example.sneha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pwd;
    String u="sneha";
    String p="abc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v){
        if(v.getId()==R.id.loginButton){
            user=(EditText)findViewById(R.id.username);
            pwd=(EditText)findViewById(R.id.password);
            String a=user.getText().toString();
            String b=pwd.getText().toString();
            if(a.equals(u)&&b.equals(p))
                Toast.makeText(this,"Login Successfull", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"Login Successfull",Toast.LENGTH_SHORT).show();
        }
    }


    }
