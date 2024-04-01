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

public class Register extends AppCompatActivity {
    private TextView txtLogin;
    private EditText edtUser, edtEmailRegister, edtPassRegister;
    private Button btnRegister;
    private ImageButton imgBackL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        initListener();
    }

    private void initView(){
        txtLogin = findViewById(R.id.txtLogin);
        edtUser = findViewById(R.id.edtUserName);
        edtEmailRegister = findViewById(R.id.edt_email_Register);
        edtPassRegister = findViewById(R.id.edt_password_Register);
        btnRegister = findViewById(R.id.btnRegister);
        imgBackL = findViewById(R.id.imgBackL);
    }
    private void initListener(){
        imgBackL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }
}