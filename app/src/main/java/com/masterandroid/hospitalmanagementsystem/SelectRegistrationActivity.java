package com.masterandroid.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegistrationActivity extends AppCompatActivity {

    private TextView back;
    private Button patientRegs, doctorReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);

       // getSupportActionBar().hide();

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });


        patientRegs = (Button)findViewById(R.id.patientRegs);
        doctorReg = (Button)findViewById(R.id.doctorReg);

        patientRegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectRegistrationActivity.this,PatientRegistrationActivity.class);
                startActivity(intent);
            }
        });

        doctorReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectRegistrationActivity.this,DoctorRegistrationActivity.class);
                startActivity(intent);
            }
        });






    }
}