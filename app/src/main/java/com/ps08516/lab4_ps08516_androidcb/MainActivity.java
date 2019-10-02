package com.ps08516.lab4_ps08516_androidcb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtSoA,txtSoB;
    Button btNBSCNN;
    Intent intent;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSoA = findViewById(R.id.edSo1);
        txtSoB = findViewById(R.id.edSo2);
        btNBSCNN= findViewById(R.id.btnBSCNN);
        btNBSCNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,SecondActivity.class);
                bundle = new Bundle();
                bundle.putInt("soA", Integer.parseInt(txtSoA.getText().toString()));
                bundle.putInt("soB",Integer.parseInt(txtSoB.getText().toString()));
                intent.putExtra("bun",bundle);
                startActivity(intent);
            }
        });
    }



}
