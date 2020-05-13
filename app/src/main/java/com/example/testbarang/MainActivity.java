package com.example.testbarang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button bTambah;
    private Button blihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bTambah=(Button) findViewById(R.id.btnTambah);
        blihat=(Button) findViewById(R.id.btnlihat);

        bTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(TambahData.getActintent(MainActivity.this));
            }
        });

        blihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //besok dilanjut
            }
        });
    }
}
