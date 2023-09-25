package com.example.ac1_pt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo);
    }

    public void btnZSaibaMais(View view){
        Intent intent = new Intent(this, zoosaibamais.class);
        startActivity(intent);
    }
    public void btnFechar(View view){
        finish();
    }

}