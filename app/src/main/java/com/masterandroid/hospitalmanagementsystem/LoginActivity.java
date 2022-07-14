package com.masterandroid.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView loginPageQuestion;
    Button loginButton;
    RadioButton rbtn_admin,rbtn_patient,rbtn_doctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getSupportActionBar().hide();

        loginPageQuestion = findViewById(R.id.loginPageQuestion);

        loginPageQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,SelectRegistrationActivity.class);
                startActivity(intent);
            }
        });

        rbtn_admin = findViewById(R.id.rbtn_admin);
        rbtn_doctor = findViewById(R.id.rbtn_doctor);
        rbtn_patient = findViewById(R.id.rbtn_patient);

        loginButton=findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbtn_admin.isChecked())
                {
                    Intent intent = new Intent(LoginActivity.this,AdminHomePageActivity.class);
                    startActivity(intent);
                }

                if(rbtn_doctor.isChecked())
                {
                    Intent intent = new Intent(LoginActivity.this,DoctorHomePageActivity.class);
                    startActivity(intent);
                }

                if(rbtn_patient.isChecked())
                {
                    Intent intent = new Intent(LoginActivity.this, PatientHomePageActivity.class);
                    startActivity(intent);
                }


            }
        });




    }
}