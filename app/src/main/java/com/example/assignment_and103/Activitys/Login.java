package com.example.assignment_and103.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.assignment_and103.R;

public class Login extends AppCompatActivity {
    private TextView txtRegister;
    private ImageButton imgBack;
    private EditText edtEmailLogin, edtPassLogin;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initListener();
    }

    private void initView(){
        txtRegister = findViewById(R.id.txtRegister);
        imgBack = findViewById(R.id.imgBack);
        edtEmailLogin = findViewById(R.id.edt_email_Login);
        edtPassLogin = findViewById(R.id.edt_password_Login);
        btnLogin = findViewById(R.id.btnLogin);
    }
    private void initListener(){
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, GetStartedScreen.class);
                startActivity(intent);
                finish();
            }
        });
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}