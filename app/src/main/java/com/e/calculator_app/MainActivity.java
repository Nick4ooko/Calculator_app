package com.e.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myScreen;
    private Button   one;
    private Button   two;
    private Button   three;
    private Button   four;
    private Button   five;
    private Button   six;
    private Button   seven;
    private Button   eight;
    private Button   nine;
    private Button   zero;
    private Button   point;
    private Button   equal;
    private Button   multiplication;
    private Button   division;
    private Button   add;
    private Button   subtraction;
    private Button   cancel;
    private Button   delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btadd =(Button) findViewById(R.id.bt_add_id);

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });









    }






}
