package com.example.broadcastproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BackgroundServices extends AppCompatActivity {

    public BackgroundServices(){
        super(name:"BackgroundServices");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_services);
    }
}
