package com.ps08516.lab4_ps08516_androidcb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView lblKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lblKQ = findViewById(R.id.lblKQ);


        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bun");
        int a = bundle.getInt("soA");
        int b = bundle.getInt("soB");
        int bscnn = BSCNN(a,b);
        lblKQ.setText(String.valueOf(bscnn));

    }


    public int USCLN(int a,int b){
        if(b==0){
            return a;
        }
        else
        {
            return USCLN(b,a%b);

        }
    }

    public int BSCNN(int a,int b){
        return(a*b)/USCLN(a,b);
    }
}



