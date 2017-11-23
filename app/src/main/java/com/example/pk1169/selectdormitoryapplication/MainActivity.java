package com.example.pk1169.selectdormitoryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userName,pwd;
    private Button login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userId);
        pwd = findViewById(R.id.pass);
        login = findViewById(R.id.loginBtn);
    }
}
