package com.example.ac1_pt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnZoo(View view){
        Intent intent = new Intent(this, Zoo.class);
        startActivity(intent);
    }

    public void btnShop(View view){
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }

    public void btnHead(View view){
        Intent intent = new Intent(this, Head.class);
        startActivity(intent);
    }
}