package com.masterandroid.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MakeAppoinmentPageActivity extends AppCompatActivity {

    ImageView back;
    Button homeAppoinment,bookAppoinment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_appoinment_page);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakeAppoinmentPageActivity.this, PatientHomePageActivity.class);
                startActivity(intent);
            }
        });

        homeAppoinment = findViewById(R.id.appoinment_home);
        bookAppoinment=findViewById(R.id.book_appoinment);

        homeAppoinment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakeAppoinmentPageActivity.this, PatientHomePageActivity.class);
                startActivity(intent);
            }
        });


        bookAppoinment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakeAppoinmentPageActivity.this, PatientHomePageActivity.class);
                startActivity(intent);
                Toast.makeText(MakeAppoinmentPageActivity.this, "Appoinment Booked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}