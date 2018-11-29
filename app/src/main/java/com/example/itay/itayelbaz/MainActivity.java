package com.example.itay.itayelbaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button bone, btwo;
    TextView tV;

    @onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bone= (Button) findViewById(R.id.bone);
        btwo= (Button) findViewById(R.id.btwo);
        tV= (TextView) findViewById(R.id.tV);
    }

    public void btn1(View view) {
        Random rnd=new Random();
        int x=rnd.nextInt();
        tV.setText("Number: " +x);
    }

    public void btn2(View view) {
        tV.setText("Nothing");
    }
}
