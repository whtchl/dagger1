package com.example.tchl.gagger;

import FactoryCar.FactoryApp;
import Family.FamilyApp;
import Family.USAFamily;
import coffee.*;
import school.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btn_makecoffee;
    Button btn_makeschool;
    Button btn_makecar;
    Button btn_makefamily;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_makecoffee = (Button)findViewById(R.id.btn_makecoffee);
        btn_makecoffee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                CoffeeApp.makkecoffee();
            }
        });

        btn_makeschool =(Button)findViewById(R.id.btn_makeshcool);
        btn_makeschool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                SchoolApp.makeschool();
            }
        });

        btn_makecar=(Button)findViewById(R.id.btn_makecar);
        btn_makecar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                FactoryApp.makeCar();
            }
        });

        btn_makefamily=(Button)findViewById(R.id.btn_makefamily);
        btn_makefamily.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                FamilyApp.makkefamily();          }
        });


    }
}
