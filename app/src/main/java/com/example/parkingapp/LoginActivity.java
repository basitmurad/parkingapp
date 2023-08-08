package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.companion.DeviceNotAssociatedException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnSignUp , btnsignIn;
    EditText editTextEmail,editTextPassword;

    SessionManager sessionManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnsignIn = findViewById(R.id.btnSigIin);


        sessionManager = new SessionManager(this);
        String email = sessionManager.fetchUserEmail();
        String password = sessionManager.fetchUserPassword();



        editTextEmail = findViewById(R.id.edittextEmaillog);
        editTextPassword = findViewById(R.id.edittextpasswordlog);


        findViewById(R.id.btnSignUp).setOnClickListener(view -> startActivity(new Intent(LoginActivity.this,SignUpActivity2.class)));



        btnsignIn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Toast.makeText(LoginActivity.this, "" + email + password, Toast.LENGTH_SHORT).show();
//           if (editTextEmail.getText().toString().isEmpty())
//           {
//               Toast.makeText(LoginActivity.this, "Enter an email", Toast.LENGTH_SHORT).show();
//           }
//            else if (editTextPassword.getText().toString().isEmpty())
//           {
//               Toast.makeText(LoginActivity.this, "Enter an password", Toast.LENGTH_SHORT).show();
//           }
//            else if (editTextEmail.getText().toString().equals(sessionManager.fetchUserEmail())  && editTextPassword.getText().toString()
//                   .equals(sessionManager.fetchUserPassword()))
//           {
//               String emil = editTextEmail.getText().toString();
//               String pass = editTextPassword.getText().toString();
//               startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
//           }
//
//           else {
//
//               Toast.makeText(LoginActivity.this, "User do not exist or check credential", Toast.LENGTH_SHORT).show();
//           }
       }
   });

    }
}