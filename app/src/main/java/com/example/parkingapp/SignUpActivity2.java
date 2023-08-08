package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity2 extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword, editTextNumber, editTextName;
   private   Button btnSignUp;

    private SessionManager sessionManager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        editTextEmail = findViewById(R.id.edittextEmail);
        editTextNumber = findViewById(R.id.edittextNumber);
        editTextPassword = findViewById(R.id.edittextNumber);
        editTextName = findViewById(R.id.edittextName);
        btnSignUp = findViewById(R.id.btnSignUp);

        sessionManager = new SessionManager(this);




        btnSignUp.findViewById(R.id.btnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextName.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUpActivity2.this, "Enter an name", Toast.LENGTH_SHORT).show();
                }
                else if  (editTextEmail.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUpActivity2.this, "Enter an password", Toast.LENGTH_SHORT).show();
                }
                else if  (editTextPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUpActivity2.this, "Enter an password", Toast.LENGTH_SHORT).show();
                }
                else if (editTextNumber.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUpActivity2.this, "Enter an number", Toast.LENGTH_SHORT).show();
                }

                else {
                    String email = editTextEmail.getText().toString();
                    String pasword = editTextPassword.getText().toString();
                    String number = editTextNumber.getText().toString();
                    String name = editTextName.getText().toString();

                    sessionManager.UserName(email);
                    sessionManager.UserEmail(pasword);
                    sessionManager.UserPassword(number);
                    sessionManager.UserNumber(name);
                    Toast.makeText(SignUpActivity2.this, "Account Successfully Created", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });


    }
}