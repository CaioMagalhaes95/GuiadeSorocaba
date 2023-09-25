package com.example.ac1_pt2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class zoosaibamais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoosaibamais);
    }


    public void btnTelefone(View view){
        Uri uri = Uri.parse("tel: 015 15 991154936");
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        int permissionCheck =
                ContextCompat.checkSelfPermission(this,
                        android.Manifest.permission.CALL_PHONE);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                    new String[]{
                            android.Manifest.permission.CALL_PHONE
                    }, 1);
        }
        else{
            startActivity(intent);
        }

    }

    public void btnMapa(View view){
        Uri uri = Uri.parse("geo: 0,0?q=Rua+Teodoro+Keisel=883");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnNavegar(View view){
        Uri uri = Uri.parse("www.sorocaba.sp.gov.br/zoologico/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnFechar(View view){
        finish();
    }



}