package com.e.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myScreen;
    private EditText myValue;
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
    private Button   percentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one =(Button) findViewById(R.id.bt_one_id);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "1");





            }
        });

        Button two =(Button) findViewById(R.id.bt_two_id);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "2");





            }
        });


        Button three =(Button) findViewById(R.id.bt_three_id);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "3");





            }
        });


        Button four =(Button) findViewById(R.id.bt_four_id);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "4");





            }
        });

        Button five =(Button) findViewById(R.id.bt_five_id);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "5");





            }
        });


        Button six =(Button) findViewById(R.id.bt_six_id);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "6");





            }
        });


        Button seven =(Button) findViewById(R.id.bt_seven_id);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "7");





            }
        });


        Button eight =(Button) findViewById(R.id.bt_eight_id);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "8");





            }
        });


        Button nine =(Button) findViewById(R.id.bt_nine_id);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "9");





            }
        });


        Button zero =(Button) findViewById(R.id.bt_zero_id);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + "0");





            }
        });


        Button point =(Button) findViewById(R.id.bt_point_id);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText myValue =(EditText)findViewById(R.id.et_values_id);
                TextView myScreen =(TextView) findViewById(R.id.tv_display_id);

                myValue.setText(myValue.getText().toString() + ".");





            }
        });










    }






}
